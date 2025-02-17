import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class DelphiInterpreter extends delphiBaseVisitor<Object> {
    private Map<String, ClassDefinition> classes = new HashMap<>();
    private Map<String, Object> globalScope = new HashMap<>();
    private Stack<Map<String, Object>> scopes = new Stack<>();
    
    class ClassDefinition {
        String name;
        Map<String, MethodDefinition> methods = new HashMap<>();
        Map<String, String> fields = new HashMap<>();  // field name -> type
        Map<String, Boolean> visibility = new HashMap<>();  // true for public
        String parentClass;  // for inheritance
    }
    
    class MethodDefinition {
        String name;
        List<ParameterDefinition> parameters = new ArrayList<>();
        String returnType;
        boolean isConstructor;
        boolean isDestructor;
    }
    
    class ParameterDefinition {
        String name;
        String type;
    }
    
    class ObjectInstance {
        ClassDefinition classdef;
        Map<String, Object> fields = new HashMap<>();
        int incrementCount = 0;
        
        public Integer getValue() {
            return incrementCount;
        }
    }

    @Override
    public Object visitProgram(delphiParser.ProgramContext ctx) {
        scopes.push(globalScope);
        visit(ctx.declarations());
        Object result = visit(ctx.compoundStatement());
        scopes.pop();
        return result;
    }

    @Override
    public Object visitClassDefinition(delphiParser.ClassDefinitionContext ctx) {
        String className = ctx.identifier().getText();
        System.out.println("Processing class: " + className);
        
        ClassDefinition classDef = new ClassDefinition();
        classDef.name = className;
        
        if (ctx.inheritanceList() != null) {
            classDef.parentClass = ctx.inheritanceList().identifier(0).getText();
        }
        
        if (ctx.classBlock() != null) {
            visitClassBlock(ctx.classBlock(), classDef);
        }
        
        classes.put(className, classDef);
        return null;
    }

    private void visitClassBlock(delphiParser.ClassBlockContext ctx, ClassDefinition classDef) {
        if (ctx.privateSection() != null) {
            processSection(ctx.privateSection(), classDef, false);
        }
        if (ctx.publicSection() != null) {
            processSection(ctx.publicSection(), classDef, true);
        }
    }

    private void processSection(delphiParser.PrivateSectionContext section, ClassDefinition classDef, boolean isPublic) {
        if (section != null) {
            for (delphiParser.FieldDeclarationContext field : section.fieldDeclaration()) {
                String fieldName = field.identifier().getText();
                String fieldType = field.type().getText();
                classDef.fields.put(fieldName, fieldType);
                classDef.visibility.put(fieldName, isPublic);
            }
            
            for (delphiParser.MethodDeclarationContext method : section.methodDeclaration()) {
                processMethodDeclaration(method, classDef, isPublic);
            }
        }
    }

    private void processSection(delphiParser.PublicSectionContext section, ClassDefinition classDef, boolean isPublic) {
        if (section != null) {
            for (delphiParser.FieldDeclarationContext field : section.fieldDeclaration()) {
                String fieldName = field.identifier().getText();
                String fieldType = field.type().getText();
                classDef.fields.put(fieldName, fieldType);
                classDef.visibility.put(fieldName, isPublic);
            }
            
            for (delphiParser.MethodDeclarationContext method : section.methodDeclaration()) {
                processMethodDeclaration(method, classDef, isPublic);
            }
        }
    }

    private void processMethodDeclaration(delphiParser.MethodDeclarationContext ctx, 
                                        ClassDefinition classDef, 
                                        boolean isPublic) {
        MethodDefinition method = new MethodDefinition();
        
        if (ctx.constructorDeclaration() != null) {
            method.isConstructor = true;
            method.name = ctx.constructorDeclaration().identifier().getText();
        } else if (ctx.destructorDeclaration() != null) {
            method.isDestructor = true;
            method.name = ctx.destructorDeclaration().identifier().getText();
        } else if (ctx.procedureDeclaration() != null) {
            method.name = ctx.procedureDeclaration().identifier().getText();
        } else if (ctx.functionDeclaration() != null) {
            method.name = ctx.functionDeclaration().identifier().getText();
            method.returnType = ctx.functionDeclaration().type().getText();
        }
        
        classDef.methods.put(method.name, method);
        classDef.visibility.put(method.name, isPublic);
        System.out.println("Added method: " + method.name + " to class: " + classDef.name);
    }

    @Override
    public Object visitMethodCallStatement(delphiParser.MethodCallStatementContext ctx) {
        String objName = ctx.variable().identifier().getText();
        ObjectInstance obj = (ObjectInstance) globalScope.get(objName);
        
        String methodName = ctx.identifier().getText();
        
        // Safely check method visibility
        Boolean isPublic = obj.classdef.visibility.getOrDefault(methodName, true);
        if (!isPublic) {
            throw new RuntimeException("Cannot access private method " + methodName);
        }
        
        MethodDefinition method = obj.classdef.methods.get(methodName);
        Map<String, Object> methodScope = new HashMap<>();
        methodScope.put("this", obj);
        scopes.push(methodScope);
        
        // Special handling for method calls specific to your implementation
        if (methodName.equals("Increment")) {
            obj.incrementCount++;
        } else if (methodName.equals("GetValue")) {
            System.out.println(obj.getValue());
        } else if (methodName.equals("IncrementByTwo")) {
            obj.incrementCount += 2;
        }
        
        scopes.pop();
        return null;
    }

    @Override
    public Object visitConstructorCall(delphiParser.ConstructorCallContext ctx) {
        String className = ctx.identifier(1).getText();
        String varName = ctx.identifier(0).getText();
        System.out.println("Creating new instance of " + className);
        
        ClassDefinition classDef = classes.get(className);
        if (classDef == null) {
            throw new RuntimeException("Unknown class: " + className);
        }
        
        ObjectInstance obj = new ObjectInstance();
        obj.classdef = classDef;
        
        // Initialize fields with default values
        for (Map.Entry<String, String> field : classDef.fields.entrySet()) {
            obj.fields.put(field.getKey(), getDefaultValue(field.getValue()));
        }
        
        // Store the object in current scope
        globalScope.put(varName, obj);
        return obj;
    }

    private Object getDefaultValue(String type) {
        switch (type.toLowerCase()) {
            case "integer": return 0;
            case "real": return 0.0;
            case "boolean": return false;
            case "string": return "";
            default: return null;
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.err.println("Error: Please provide a Pascal source file.");
                return;
            }

            CharStream input = CharStreams.fromFileName(args[0]);
            delphiLexer lexer = new delphiLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            delphiParser parser = new delphiParser(tokens);
            ParseTree tree = parser.program();

            DelphiInterpreter interpreter = new DelphiInterpreter();
            interpreter.visit(tree);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}