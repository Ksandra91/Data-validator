package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema<Map<?, ?>> {

    public MapSchema() {

    }

    public final MapSchema required() {
        checks.put("requiredMap", map -> map != null);
        return this;
    }

    public final MapSchema sizeof(int size) {
        checks.put("sizeof", map -> map.size() == size);
        return this;
    }
}
