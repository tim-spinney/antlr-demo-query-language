grammar TypeDefs;

import Common;

typeDefs: typeDef+ EOF;

typeDef: 'TYPE' TypeName '{' fieldDef (',' fieldDef)* '}' ;

fieldDef: VarName ':' typeReference ;

typeReference: TypeName NullableModifier? ;

NullableModifier: '?' ;
