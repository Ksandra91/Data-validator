package hexlet.code.schemas;

import java.util.Objects;

public class NumberSchema extends BaseSchema<Integer> {

    public NumberSchema() {

    }

    public final NumberSchema required() {
        checks.put("requiredNumber", Objects::nonNull);
        return this;
    }

    public final NumberSchema positive() {
        checks.put("positive", num -> num == null || num > 0);
        return this;
    }

    public final NumberSchema range(int bottom, int up) {
        checks.put("range", num -> num >= bottom && num <= up);
        return this;
    }
}
