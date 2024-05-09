package hexlet.code.schemas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BaseSchema<T> {

    protected LinkedHashMap<String, Predicate<T>> checks = new LinkedHashMap<>();

    public final boolean isValid(T obj) {
        boolean validation = true;
        for (Map.Entry<String, Predicate<T>> check : checks.entrySet()) {
            if (!check.getValue().test(obj)) {
                validation = false;
                break;
            }
        }
        return validation;
    }
}
