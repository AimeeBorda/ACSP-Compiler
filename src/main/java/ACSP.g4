grammar ACSP;


spec : definition*;

definition : channelDecl | simpleDefinition | assertDefinition | comment;

channelDecl : CHANNEL channelNames (channelColonType)?;


channelNames : ID(COMMA ID)*;										//it should return a  list (check this in the antlr book)
	 									//stores the IDs in a list (field)

channelColonType : COLLON  type	;								//it should return the type


simpleDefinition : definitionLeft EQUAL any;

assertDefinition
	: ASSERT definitionLeft COLLON LBRACKET checkConditionBody RBRACKET
	| ASSERT definitionLeft refinedBy definitionLeft;

refinedBy :
    TRACEREFINE
    | FAILUREREFINE
    | FAILUREDIVREFINE
    ;

definitionLeft
	: defnCallLeft
	| defnCallLeft LPAREN any* RPAREN
	;

defnCallLeft
	: ID
 	;

any
	: proc
	| boolExp
	| expr
	;

checkConditionBody
	: DEADLOCK FREE modelCheckType?
	| DIVERGENCE FREE modelCheckType?
	| DETERMINISTIC modelCheckType?
	;

modelCheckType
	: FAILUREDIVE
	| FAILURE
	| TRACE
	;

type
	: simple
	| type DOT type
	| set
	;

simple		//TODO: expand this rule
	: ID
	;

set										//TODO: expand this rule
	: LBRACE (any(COMMA any)*|(any DOT DOT any)?) RBRACE
	;

proc									//TODO: came from rule _proc (try to make union of rules _proc and amb)
	:
	terminalProc
	| locProcess          //TODO: replace with event
	| locOutput
	| parallelProc
	| eventHide
	| ifStat								//TODO: revise
	| chxProc
	| prfProc
	| ID
	| cspProc
	;

cspProc :   LPAREN proc (TIMEOUT | INTR | SEMICOL | INTL) proc RPAREN
           | boolExp GUARD proc;

locProcess : ID LBRACKET proc RBRACKET ;
locOutput :  ID PLING proc DOT proc ;
parallelProc :  LPAREN NEW channelNames RPAREN LPAREN proc LSYNC set RSYNC proc RPAREN;
eventHide : LPAREN proc RPAREN BACKSLASH set;
ifStat : IF boolExp THEN proc ELSE proc;
chxProc : LPAREN proc ECHOICE proc RPAREN;
prfProc : ID ARROW proc	    ;
terminalProc : Skip | Stop ;


boolExp										//boolean expressions
	: NOT boolOrAmb
	| expr (LT | GT | LTEQ | GTEQ | EQ | NEQ) expr
	| boolExp  (AND | OR) boolExp
	| TRUE
	| FALSE
	| ID
	| number
	;

boolOrAmb
	: boolExp
	| simple
	;

expr										//arith expressions
	: MINUS expr
	| expr (TIMES | DIV | PLUS | MINUS | MOD) expr
	| LPAREN expr RPAREN
	| number
	| ID
	;

number
   : DIGIT+
   ;

comment
	: LINECOMMENT	//TODO: include multiline comment and return the text of comment
	;

AND : 'and';
OR  : 'or' ;
EQ	: '==';
NEQ : '!=';
LT	: '<';
GT	: '>';
LTEQ	: '<=';
GTEQ	: '>=';
NOT	: 'not';
PLUS	: '+';
TIMES	: '*';
MINUS	: '-';
NEW : 'new';
DIV		: '/';
MOD	: '%';
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
Skip : 'SKIP' ;
Stop : 'STOP' ;
DIVERGE : 'div' ;
TRUE : 'true' ;
FALSE : 'false' ;
GUARD : '&' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET: '[';
RBRACKET: ']';
LSYNC : '[|' ;
RSYNC : '|]' ;
INTL :	'|||';
ECHOICE :	'[]';
ICHOICE :	'|~|';
COMMA	:	',';
COLLON	:	':';
SEMICOL	:	';';
ARROW	:	'->';
QUERY	:	'?';
PLING	:	'!';
CHANNEL	:	'channel';
DOT	:	'.';
LBRACE	: '{';
RBRACE	: '}';
EQUAL	: '=';
BACKSLASH : '\\';
TIMEOUT	: '[>';
INTR	: '/\\';
ASSERT : 'assert';
DEADLOCK : 'deadlock';
DETERMINISTIC : 'deterministic';
DIVERGENCE : 'divergence';
FAILUREDIVE : ' [FD]';
FAILURE : ' [F]';
TRACE: ' [T]';
TRACEREFINE : '[T=';
FAILUREREFINE : '[F=';
FAILUREDIVREFINE : '[FD=';
FREE: ' free';


DIGIT
   : ('0' .. '9')
   ;
ID : [a-zA-Z]+					//TODO: revise - ids do not allow numbers or special chars
	;

LINECOMMENT
    : ('--') ~('\r'|'\n')* -> channel (HIDDEN)
    ;

WS
   : [ \r\n\t]+ -> channel (HIDDEN)
   ;