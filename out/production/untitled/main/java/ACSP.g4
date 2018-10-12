grammar ACSP;

options
{
    language = Java;
}


skipCmd : SKIPLBL;
choiceCmd : CHX SET_STAT AT VAR PRF statement;
ifCmd : IF BOOL THEN statement ELSE statement;
parallelCmd : BRACL statement SQL SET_EVENTS SQR statement BRACR;
scopeCmd : BRACL NEW CH BRACR statement;
outputCmd : CH  SND statement FULLSTOP statement;
locCmd : CH SQL statement SQR;
funcCall : VAR BRACL (EVENT)* BRACL;
funcDefn : VAR BRACL (VAR)* BRACR EQ statement;

statement : (skipCmd|choiceCmd|ifCmd|parallelCmd|scopeCmd|outputCmd|locCmd|funcCall|funcDefn);


ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'a'..'z'|'A'..'Z')*;
BOOL : 'true' | 'false';
EVENT : ID;
VAR : ID;
CH : ID;

SET_EVENTS : '{' ((EVENT)(','EVENT)*)? '}';
SET_STAT : VAR ':' SET_EVENTS;

SKIPLBL : 'SKIP';
CHX : '[]';
IF: 'If';
THEN :  'Then';
ELSE : 'Else';
NEW : 'new';
PRF: '->';
SND : '!';
FULLSTOP : '.';
AT :'@';
BRACL : '(';
BRACR : ')';
SQL : '[';
SQR : ']';
EQ : '=';