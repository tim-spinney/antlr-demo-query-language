grammar Queries;

import Common;

queries: namedQuery+ EOF ;

namedQuery: 'QUERY' VarName 'ON' TypeName ':' query ';' ;

query: 'WHERE' logicalExpression;

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

variableAccess: VarName ('.' variableAccess)? ;

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

IntLiteral: [-]?[0-9]+ ;

/* WHERE clause use cases:
- filter out odd or even
- comparison to other numbers (literals)
*/

/* Sample WHERE clauses:
- WHERE it % 2 == 0
- WHERE (numeric expression) comparator (numeric expression)

*/