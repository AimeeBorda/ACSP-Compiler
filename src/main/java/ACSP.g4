grammar ACSP;

spec : definition*;

definition : channelDecl | simpleDefinition | assertDefinition | comment ;

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

simple
	: ID
	;

set
	: LBRACE (any(COMMA any)*|(any DOT DOT any)?) RBRACE
	;

proc
	:Skip
     	| Stop
     	| ID ARROW proc
     	| proc ECHOICE proc
     	| proc ICHOICE proc
     	| proc INTL proc
     	| IF boolExp THEN proc ELSE proc
     	| boolExp GUARD proc
     	| proc BACKSLASH set
     	| proc LSYNC set RSYNC proc
     	| proc TIMEOUT proc
     	| proc INTR proc
     	| proc SEMICOL proc
     	| LPAREN proc RPAREN
     	| ID
	    | locProcess
	    | locOutput
	    | parallelProc
	    | LET simpleDefinition+ WITHIN any
	    ;

locProcess : ID LBRACKET proc RBRACKET ;
locOutput :  ID PLING proc DOT proc ;
parallelProc :  LPAREN NEW channelNames RPAREN LPAREN proc LSYNC set RSYNC proc RPAREN;


boolExp
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

expr
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
LET : 'let';
WITHIN : 'within';
INCLUDE : 'include';
DBLQUOTE : '"';
ACSP : 'acsp';

DIGIT: ('0' .. '9');
ID : [a-zA-Z][a-zA-Z0-9'_]*	;

LINECOMMENT : ('--') ~('\r'|'\n')* -> channel (HIDDEN) ;

WS : [ \r\n\t]+ -> channel (HIDDEN);