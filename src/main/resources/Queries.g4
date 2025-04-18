grammar Queries;

query: 'WHERE' numericExpression Comparator numericExpression EOF ;

numericExpression:
    numericExpression (Mult | Div) numericExpression
  | numericExpression Add numericExpression
  | numericExpression Mod numericExpression
  | IntLiteral
  | Identifier ;

Mult: '*' ;
Div: '/' ;
Add: '+' ;
Mod: '%' ;

// 1. How do you avoid infinite recursion when starting with numericExpression ?
// 2. How do you add parenthetical groupings?
// 3. add support for evaluating these expressions to Main
// numericBinaryExpression: '(' numericExpression NumericBinaryOperator numericExpression ')' ;

Comparator: '==' | '<>' | '>' | '<' | '>=' | '<=' ;

Whitespace: [ \t\r\n]+ -> skip ;

IntLiteral: [-]?[0-9]+ ;

Identifier: 'it' ;

/* WHERE clause use cases:
- filter out odd or even
- comparison to other numbers (literals)
*/

/* Sample WHERE clauses:
- WHERE it % 2 == 0
- WHERE (numeric expression) comparator (numeric expression)

*/