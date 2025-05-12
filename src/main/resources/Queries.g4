grammar Queries;

query: 'WHERE' logicalExpression EOF ;

logicalExpression:
    op=Not logicalExpression
  | numericExpression op=Comparator numericExpression
  | logicalExpression op=And logicalExpression
  | logicalExpression op=Or logicalExpression
  ;

numericExpression:
    numericExpression (op=Mult | op=Div) numericExpression
  | numericExpression (op=Add | op=Sub) numericExpression
  | numericExpression op=Mod numericExpression
  | IntLiteral
  | variableAccess ;

variableAccess: Identifier ('.' variableAccess)? ;

Mult: '*' ;
Div: '/' ;
Add: '+' ;
Sub: '-' ;
Mod: '%' ;
And: 'AND' ;
Or: 'OR' ;
Not: 'NOT' ;

// 1. How do you avoid infinite recursion when starting with numericExpression ?
// 2. How do you add parenthetical groupings?
// 3. add support for evaluating these expressions to Main
// numericBinaryExpression: '(' numericExpression NumericBinaryOperator numericExpression ')' ;

Comparator: '==' | '<>' | '>' | '<' | '>=' | '<=' ;

Whitespace: [ \t\r\n]+ -> skip ;

IntLiteral: [-]?[0-9]+ ;

Identifier: [a-z][a-z_]* ;

/* WHERE clause use cases:
- filter out odd or even
- comparison to other numbers (literals)
*/

/* Sample WHERE clauses:
- WHERE it % 2 == 0
- WHERE (numeric expression) comparator (numeric expression)

*/