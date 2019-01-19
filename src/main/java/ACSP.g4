grammar ACSP;

spec : definition*;

definition : dataTypeDefinition | channelDecl  | assertDefinition | funcImport | includeFile  | simpleDefinition;

includeFile : INCLUDE DBLQUOTE ID (DIV ID)* DOT ACSP DBLQUOTE;

funcImport : (TRANSPARENT | EXTERNAL) ID ;

dataTypeDefinition : (DATATYPE | SUBTYPE | NAMETYPE) ID EQUAL type (BAR type)*;


channelDecl : CHANNEL channelNames (channelColonType)?;

channelNames : ID(COMMA ID)*;

channelColonType : COLLON  type	;

simpleDefinition : definitionLeft EQUAL any;

assertDefinition
	: ASSERT definitionLeft COLLON LBRACKET checkConditionBody RBRACKET
	| ASSERT proc refinedBy proc;

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
	| LIVELOCK FREE modelCheckType?
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
	: ID
	| number
	| type DOT type
	| set
	;


set
	: (LBRACE (any(COMMA any)*|(any DOT DOT any)?) RBRACE)
	| (LBBRACE (any(COMMA any)*|(any DOT DOT any)?) RBBRACE)
	| definitionLeft
	| LBRACE (any(COMMA any)*) BAR setComprehension(COMMA setComprehension)* RBRACE
	;

setComprehension : any RARROW type | boolExp;

proc:     Skip
     	| Stop
     	| event ARROW proc
     	| proc ECHOICE proc
     	| proc ICHOICE proc
     	| IF boolExp THEN proc ELSE proc
     	| boolExp GUARD proc
     	| proc (BACKSLASH | PROJECT) set
     	| proc TIMEOUT proc
     	| proc INTR proc
     	| proc SEMICOL proc
     	| LPAREN proc RPAREN
        | locProcess
	    | locOutput
	    | parallelProc
	    | letProc
	    | definitionLeft
	    ;

event : ID ((QUERY | PLING | DOLLAR | DOT) ID (COLLON type)?)*;
locProcess : ID LBRACKET proc RBRACKET ;
locOutput :  ID PLING LT proc GT DOT proc ;
parallelProc :  (LPAREN NEW locNames RPAREN)? LPAREN proc parallelSync proc RPAREN;
letProc : LET simpleDefinition+ WITHIN any;

locNames: ID(COMMA ID)*;
parallelSync : (LSYNC set RSYNC | INTL | LBRACKET set BAR BAR set RBRACKET);
boolExp
	: NOT boolExp
	| expr (LT | GT | LTEQ | GTEQ | EQ | NEQ) expr
	| boolExp  (AND | OR) boolExp
	| TRUE
	| FALSE
	| definitionLeft
	| number
	| LPAREN boolExp RPAREN
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
DOLLAR : '$';
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
LIVELOCK : 'livelock';
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