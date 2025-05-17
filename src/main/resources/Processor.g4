grammar Processor;

import Common;

script: includeStatement+ executableStatement+ EOF ;

// could use a regex to enforce valid filenames but that's OS-specific and messy
includeStatement: 'INCLUDE' type=(Types | Queries) StringLiteral ';' ;

executableStatement: (loadStatement | runQueryStatement | saveStatement) ';';

loadStatement: 'LOAD' StringLiteral 'INTO' VarName 'AS' TypeName ;

runQueryStatement: 'RUN' queryName=VarName 'ON' sourceName=VarName 'INTO' destinationName=VarName ;

saveStatement: 'SAVE' VarName 'TO' StringLiteral ;

StringLiteral: '"' (. | '\\"')*? '"' ;

Types: 'TYPES' ;
Queries: 'QUERIES' ;