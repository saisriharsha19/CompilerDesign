// Generated from delphi.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link delphiParser}.
 */
public interface delphiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(delphiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(delphiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(delphiParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(delphiParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodImplementation}.
	 * @param ctx the parse tree
	 */
	void enterMethodImplementation(delphiParser.MethodImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodImplementation}.
	 * @param ctx the parse tree
	 */
	void exitMethodImplementation(delphiParser.MethodImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constructorImplementation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorImplementation(delphiParser.ConstructorImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constructorImplementation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorImplementation(delphiParser.ConstructorImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#destructorImplementation}.
	 * @param ctx the parse tree
	 */
	void enterDestructorImplementation(delphiParser.DestructorImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#destructorImplementation}.
	 * @param ctx the parse tree
	 */
	void exitDestructorImplementation(delphiParser.DestructorImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#procedureImplementation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureImplementation(delphiParser.ProcedureImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#procedureImplementation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureImplementation(delphiParser.ProcedureImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionImplementation(delphiParser.FunctionImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionImplementation(delphiParser.FunctionImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterClassIdentifier(delphiParser.ClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitClassIdentifier(delphiParser.ClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(delphiParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(delphiParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#inheritanceList}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceList(delphiParser.InheritanceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#inheritanceList}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceList(delphiParser.InheritanceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#privateSection}.
	 * @param ctx the parse tree
	 */
	void enterPrivateSection(delphiParser.PrivateSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#privateSection}.
	 * @param ctx the parse tree
	 */
	void exitPrivateSection(delphiParser.PrivateSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#publicSection}.
	 * @param ctx the parse tree
	 */
	void enterPublicSection(delphiParser.PublicSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#publicSection}.
	 * @param ctx the parse tree
	 */
	void exitPublicSection(delphiParser.PublicSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(delphiParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(delphiParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(delphiParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(delphiParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(delphiParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(delphiParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(delphiParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(delphiParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(delphiParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(delphiParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(delphiParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(delphiParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(delphiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(delphiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(delphiParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(delphiParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(delphiParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(delphiParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(delphiParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(delphiParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(delphiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(delphiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(delphiParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(delphiParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(delphiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(delphiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(delphiParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(delphiParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(delphiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(delphiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(delphiParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(delphiParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(delphiParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(delphiParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(delphiParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(delphiParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(delphiParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(delphiParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(delphiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(delphiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(delphiParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(delphiParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(delphiParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(delphiParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(delphiParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(delphiParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(delphiParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(delphiParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(delphiParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(delphiParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(delphiParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(delphiParser.StringContext ctx);
}