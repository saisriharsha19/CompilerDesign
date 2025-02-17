grammar delphi;

program
    : PROGRAM identifier SEMICOLON
      declarations
      compoundStatement 
      DOT
    ;

declarations
    : (constantDefinition SEMICOLON)*
      (typeDefinition SEMICOLON)*
      (classDefinition SEMICOLON)*
      (methodImplementation SEMICOLON)*
      (variableDeclaration SEMICOLON)*
    ;

// Method implementations outside class definition
methodImplementation
    : constructorImplementation
    | destructorImplementation
    | procedureImplementation
    | functionImplementation
    ;

constructorImplementation
    : CONSTRUCTOR classIdentifier DOT identifier SEMICOLON block
    ;

destructorImplementation
    : DESTRUCTOR classIdentifier DOT identifier SEMICOLON block
    ;

procedureImplementation
    : PROCEDURE classIdentifier DOT identifier parameterList? SEMICOLON block
    ;

functionImplementation
    : FUNCTION classIdentifier DOT identifier parameterList? COLON type SEMICOLON block
    ;

classIdentifier
    : identifier
    ;

classDefinition
    : CLASS identifier 
      (LPAREN inheritanceList RPAREN)?  // For inheritance
      classBlock
      END
    ;

inheritanceList
    : identifier (COMMA identifier)*
    ;

classBlock
    : (PRIVATE privateSection?)?
      (PUBLIC publicSection?)?
    ;

privateSection
    : (fieldDeclaration | methodDeclaration)*
    ;

publicSection
    : (fieldDeclaration | methodDeclaration)*
    ;

fieldDeclaration
    : identifier COLON type SEMICOLON
    ;

methodDeclaration
    : constructorDeclaration
    | destructorDeclaration
    | procedureDeclaration
    | functionDeclaration
    ;

constructorDeclaration
    : CONSTRUCTOR identifier parameterList? SEMICOLON
    ;

destructorDeclaration
    : DESTRUCTOR identifier parameterList? SEMICOLON
    ;

procedureDeclaration
    : PROCEDURE identifier parameterList? SEMICOLON
    ;

functionDeclaration
    : FUNCTION identifier parameterList? COLON type SEMICOLON
    ;

parameterList
    : LPAREN parameter (SEMICOLON parameter)* RPAREN
    ;

parameter
    : identifier COLON type
    ;

compoundStatement
    : BEGIN
      statementList?
      END
    ;

statementList
    : statement (SEMICOLON statement)*
    ;

statement
    : assignmentStatement
    | methodCallStatement
    | constructorCall
    | ifStatement
    | whileStatement
    | compoundStatement
    | emptyStatement
    ;

assignmentStatement
    : variable ASSIGN expression
    ;

methodCallStatement
    : variable DOT identifier (LPAREN expressionList? RPAREN)?
    ;

constructorCall
    : identifier ASSIGN NEW identifier
    ;

ifStatement
    : IF expression THEN statement (ELSE statement)?
    ;

whileStatement
    : WHILE expression DO statement
    ;

emptyStatement
    :
    ;

block
    : declarations?
      compoundStatement
    ;

variable
    : identifier
    | variable DOT identifier
    ;

expression
    : simpleExpression
    | expression relationalOperator simpleExpression
    ;

simpleExpression
    : term
    | simpleExpression additiveOperator term
    ;

term
    : signedFactor
    | term multiplicativeOperator signedFactor
    ;

signedFactor
    : (PLUS | MINUS)? factor
    ;

factor
    : variable
    | LPAREN expression RPAREN
    | functionCall
    | constant
    ;

functionCall
    : identifier LPAREN expressionList? RPAREN
    ;

expressionList
    : expression (COMMA expression)*
    ;

relationalOperator
    : EQUALS
    | NOT_EQUALS
    | LESS_THAN
    | LESS_EQUALS
    | GREATER_EQUALS
    | GREATER_THAN
    ;

additiveOperator
    : PLUS
    | MINUS
    | OR
    ;

multiplicativeOperator
    : STAR
    | SLASH
    | DIV
    | MOD
    | AND
    ;

constant
    : number
    | string
    | identifier
    ;

// Basic definitions
variableDeclaration
    : VAR identifier COLON type
    ;

constantDefinition
    : CONST identifier EQUALS constant
    ;

typeDefinition
    : TYPE identifier EQUALS type
    ;

type
    : simpleType
    | arrayType
    | pointerType
    | classType
    ;

simpleType
    : identifier
    ;

arrayType
    : ARRAY LBRACK number DOTDOT number RBRACK OF type
    ;

pointerType
    : POINTER type
    ;

classType
    : identifier
    ;

// Lexer Rules
PROGRAM     : 'program';
BEGIN       : 'begin';
END         : 'end';
VAR         : 'var';
CONST       : 'const';
TYPE        : 'type';
CLASS       : 'class';
PRIVATE     : 'private';
PUBLIC      : 'public';
CONSTRUCTOR : 'constructor';
DESTRUCTOR  : 'destructor';
PROCEDURE   : 'procedure';
FUNCTION    : 'function';
IF          : 'if';
THEN        : 'then';
ELSE        : 'else';
WHILE       : 'while';
DO          : 'do';
NEW         : 'new';
ARRAY       : 'array';
OF          : 'of';
POINTER     : 'pointer';
OR          : 'or';
AND         : 'and';
NOT         : 'not';
DIV         : 'div';
MOD         : 'mod';

EQUALS          : '=';
NOT_EQUALS      : '<>';
LESS_THAN       : '<';
LESS_EQUALS     : '<=';
GREATER_EQUALS  : '>=';
GREATER_THAN    : '>';
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
SLASH           : '/';
DOT             : '.';
COMMA           : ',';
SEMICOLON       : ';';
COLON           : ':';
LPAREN          : '(';
RPAREN          : ')';
LBRACK          : '[';
RBRACK          : ']';
ASSIGN          : ':=';
DOTDOT          : '..';

identifier : IDENT;
number     : NUMBER;
string     : STRING;

IDENT  : [a-zA-Z][a-zA-Z0-9_]*;
NUMBER : [0-9]+;
STRING : '\'' .*? '\'';
WS     : [ \t\r\n]+ -> skip;
COMMENT: '{' .*? '}' -> skip;