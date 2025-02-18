// Generated from delphi.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link delphiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface delphiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(delphiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(delphiParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodImplementation(delphiParser.MethodImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constructorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorImplementation(delphiParser.ConstructorImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#destructorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorImplementation(delphiParser.DestructorImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#procedureImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureImplementation(delphiParser.ProcedureImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#functionImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionImplementation(delphiParser.FunctionImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassIdentifier(delphiParser.ClassIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(delphiParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#inheritanceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceList(delphiParser.InheritanceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#privateSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateSection(delphiParser.PrivateSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#publicSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicSection(delphiParser.PublicSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(delphiParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(delphiParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(delphiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(delphiParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(delphiParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(delphiParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(delphiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#writelnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritelnStatement(delphiParser.WritelnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(delphiParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(delphiParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(delphiParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(delphiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(delphiParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(delphiParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(delphiParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(delphiParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(delphiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(delphiParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(delphiParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(delphiParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(delphiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(delphiParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(delphiParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(delphiParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(delphiParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(delphiParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(delphiParser.StringContext ctx);
}