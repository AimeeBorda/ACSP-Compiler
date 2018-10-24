grammar ACSP;

spec : definition*;

definition : dataTypeDefinition | channelDecl  | assertDefinition | funcImport |  simpleDefinition;

funcImport : (TRANSPARENT | EXTERNAL) ID;

dataTypeDefinition : (DATATYPE | SUBTYPE | NAMETYPE) ID EQUAL type (BAR type)*;

channelDecl : CHANNEL channelNames (channelColonType)?;

channelNames : ID(COMMA ID)*;

channelColonType : COLLON  type	;

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
	: ID
	| ID LPAREN any(COMMA any)* RPAREN
	;

any
	: proc
	| boolExp
	| expr
	| event
	| type

	;
checkConditionBody
	: DEADLOCK FREE modelCheckType?
	| DIVERGENCE FREE modelCheckType?
	| DETERMINISTIC modelCheckType?
	| POR
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

simple
	: ID
	;

set
	: (LBRACE (any(COMMA any)*|(any DOT DOT any)?) RBRACE)
	| (LBBRACE (any(COMMA any)*|(any DOT DOT any)?) RBBRACE)
	| definitionLeft
	| LBRACE any BAR setComprehension(COMMA setComprehension)* RBRACE
	;

setComprehension : any RARROW type;

proc
	:Skip
     	| Stop
     	| event ARROW proc
     	| proc ECHOICE proc
     	| proc ICHOICE proc
     	| proc INTL proc
     	| IF boolExp THEN proc ELSE proc
     	| boolExp GUARD proc
     	| proc (BACKSLASH | PROJECT) set
     	| proc LSYNC set RSYNC proc
     	| proc TIMEOUT proc
     	| proc INTR proc
     	| proc SEMICOL proc
     	| LPAREN proc RPAREN
     	| ID LPAREN any(COMMA any)* RPAREN
	    | locProcess
	    | locOutput
	    | parallelProc
	    | LET simpleDefinition+ WITHIN any
	    | ID
	    | proc LSYNC set RSYNC proc RPAREN
	    ;

event : ID ((QUERY | PLING) any (COLLON type)?)*;

locProcess : ID LBRACKET proc RBRACKET ;
locOutput :  ID PLING LT proc GT DOT proc ;
parallelProc :  LPAREN NEW locNames RPAREN LPAREN proc LSYNC set RSYNC proc RPAREN;

locNames: ID(COMMA ID)*;

boolExp
	: NOT boolOrAmb
	| expr (LT | GT | LTEQ | GTEQ | EQ | NEQ) expr
	| boolExp  (AND | OR) boolExp
	| TRUE
	| FALSE
	| ID
	| number
	| LBRACE boolExp RBRACE
	;

boolOrAmb
	: boolExp
	| simple
	;

expr
	: MINUS expr
	| expr (TIMES | DIV | PLUS | MINUS | MOD) expr
	| LPAREN expr RPAREN
	| number
	| ID
	| set
	| event
	;

number: DIGIT+;
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
PROJECT: '|\\';
COMMA	:	',';
COLLON	:	':';
SEMICOL	:	';';
DATATYPE : 'datatype';
ARROW	:	'->';
RARROW	:	'<-';
QUERY	:	'?';
PLING	:	'!';
CHANNEL	:	'channel';
DOT	:	'.';
LBRACE	: '{';
LBBRACE : '{|';
RBBRACE : '|}';
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
LET : 'let';
WITHIN : 'within';
INCLUDE : 'include';
DBLQUOTE : '"';
ACSP : 'acsp';
BAR : '|';
SUBTYPE : 'subtype';
TRANSPARENT: 'transparent';
EXTERNAL : 'external';
NAMETYPE : 'nametype';
DIGIT: ('0' .. '9');
POR : 'partial order reduce';

ID : [a-zA-Z_][a-zA-Z0-9'_]*	;

LINECOMMENT : ('--') ~('\r'|'\n')* -> channel (HIDDEN) ;
WS : ( '\t' | ' ' | '\r'|'\n'| '\u000C' )+ ->channel (HIDDEN) ;