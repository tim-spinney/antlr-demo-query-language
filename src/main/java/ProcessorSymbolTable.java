import java.util.*;

public class ProcessorSymbolTable {
    private final Map<String, Type> typesByName = new HashMap<>();
    private final Map<String, QueriesParser.QueryContext> queryNames = new HashMap<>();

    public Map<String, Type> getTypes() {
        return Collections.unmodifiableMap(typesByName);
    }

    public void addTypes(Map<String, Type> types) {
        typesByName.putAll(types);
    }

    /**
     *
     * @param name
     * @return true if this was a new name, false if it was a duplicate of an existing query
     */
    public boolean addQuery(String name, QueriesParser.QueryContext queryContext) {
        return queryNames.putIfAbsent(name, queryContext) == null;
    }
}
