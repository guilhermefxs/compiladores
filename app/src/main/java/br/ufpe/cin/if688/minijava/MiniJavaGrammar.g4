/*
BSD License
Copyright (c) 2013, Tom Everett
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar MiniJavaGrammar;

program
   : mainClass classDeclaration*
    ;

mainClass
    : CLASS identifier OPEN_BLOCK
        PUBLIC STATIC VOID MAIN OPEN_PARENTESIS STRING OPEN_BRACKET CLOSE_BRACKET identifier CLOSE_PARENTESIS
        OPEN_BLOCK statement CLOSE_BLOCK
     CLOSE_BLOCK
    ;

classDeclaration
    :
        CLASS identifier (EXTENDS identifier)? OPEN_BLOCK
            varDeclaration*
            methodDeclaration*
        CLOSE_BLOCK
    ;

varDeclaration
    : type identifier SEMICOLON
    ;

methodDeclaration
    : PUBLIC type identifier OPEN_PARENTESIS (parameterList)? CLOSE_PARENTESIS
    OPEN_BLOCK
        varDeclaration*
        statement*
        RETURN expression SEMICOLON
    CLOSE_BLOCK
    ;

parameterList:
        type identifier (COMMA type identifier)*
    ;

statement
    : statementBlock |
      assignment |
      arrayAssignment |
      print |
      ifStatement |
      whileStatement
    ;

statementBlock
    : OPEN_BLOCK statement* CLOSE_BLOCK
    ;

ifStatement
    : IF OPEN_PARENTESIS expression CLOSE_PARENTESIS statement ELSE statement
    ;

whileStatement
    : WHILE OPEN_PARENTESIS expression CLOSE_PARENTESIS statement
    ;

assignment
    : identifier EQUALS expression SEMICOLON
    ;

print
    : SISOUT OPEN_PARENTESIS expression CLOSE_PARENTESIS SEMICOLON
    ;

arrayAssignment
    : identifier OPEN_BRACKET expression CLOSE_BRACKET EQUALS expression SEMICOLON
    ;

expression
    : TRUE | FALSE | INTEGER | THIS |
      notExpression |
      objectInstatiation |
      arrayInstatiation |
      identifier |
      parentesis |
      expression DOT identifier OPEN_PARENTESIS ( parameterListCall )? CLOSE_PARENTESIS |
      expression  (AND | PLUS | MINUS | TIMES | LESS_THAN) expression |
      expression DOT LENGTH |
      expression OPEN_BRACKET expression CLOSE_BRACKET
    ;

parentesis
    :
    OPEN_PARENTESIS expression CLOSE_PARENTESIS
    ;

parameterListCall
    :
    expression ( COMMA expression )*
    ;

notExpression
    : NOT expression
    ;

objectInstatiation
    : NEW identifier OPEN_PARENTESIS CLOSE_PARENTESIS
    ;

arrayInstatiation
    : NEW INT OPEN_BRACKET expression CLOSE_BRACKET
    ;

identifier
    : IDENTIFIER
    ;

type
    : INT | INT_ARRAY  | BOOLEAN | identifier
    ;

LENGTH
    : 'length'
    ;

DOT :
        '.'
    ;

AND
    : '&&'
    ;

LESS_THAN
    : '<'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

TIMES
    : '*'
    ;

NOT
 : '!'
 ;

NEW
    : 'new'
    ;

INTEGER
    : ('0' .. '9')+
    ;

THIS
    : 'this'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

WHILE
    : 'while'
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

SISOUT
    : 'System.out.println'
    ;

EQUALS
    : '='
    ;

SEMICOLON
    : ';'
    ;

RETURN
    : 'return'
    ;

COMMA
    : ','
    ;

INT
    : 'int'
    ;

INT_ARRAY
    : INT OPEN_BRACKET CLOSE_BRACKET
    ;

BOOLEAN
    : 'boolean'
    ;

EXTENDS
    : 'extends'
    ;

CLASS
    : 'class'
    ;

OPEN_BLOCK
    : '{'
    ;
CLOSE_BLOCK
    : '}'
    ;

OPEN_PARENTESIS
    : '('
    ;

CLOSE_PARENTESIS
    : ')'
    ;

OPEN_BRACKET
    : '['
    ;

CLOSE_BRACKET
    : ']'
    ;

PUBLIC
    : 'public'
    ;

STATIC
    : 'static'
    ;

VOID
    : 'void'
    ;

MAIN
    : 'main'
    ;

STRING
    : 'String'
    ;

IDENTIFIER
   : VALID_ID_START(VALID_ID_CHAR)*
   ;

VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


 VALID_ID_CHAR
   : ('a' .. 'z') | ('A' .. 'Z') | '_' | ('0' .. '9')
   ;


SLASH:
    '/'
    ;

COMMENT:
    SLASH SLASH ~[\r\n]* -> skip
;

MULTI_LINE_COMMENT:
    '/*' .* '*/' -> skip
;


WS
   : [ \t\r\n] -> skip
   ;