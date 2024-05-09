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

    public final <T> MapSchema shape(Map<String, BaseSchema<T>> schemas) {
        checks.put("shape", map -> checkMap(map, schemas));
        return this;
    }

    private <T> boolean checkMap(Map<?, ?> map, Map<String, BaseSchema<T>> schemas) {
        for (var e : map.entrySet()) {
            if (!schemas.get(e.getKey()).isValid((T) e.getValue())) {
                return false;
            }
        }
        return true;
    }
}
