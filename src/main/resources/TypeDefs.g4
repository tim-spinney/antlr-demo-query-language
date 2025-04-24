grammar TypeDefs;

typeDefs: typeDef+ EOF;

typeDef: 'TYPE' TypeName '{' fieldDef (',' fieldDef)* '}' ;

fieldDef: FieldName ':' typeReference ;

typeReference: TypeName ReferenceModifier? NullableModifier? ;

TypeName: [A-Z][a-zA-Z]* ;

FieldName: [a-z][a-zA-Z]* ;

ReferenceModifier: '&' ;

NullableModifier: '?' ;

WS: [ \t\r\n]+ -> skip;