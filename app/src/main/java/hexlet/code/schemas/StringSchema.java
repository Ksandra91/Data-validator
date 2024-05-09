package hexlet.code.schemas;

public class StringSchema extends BaseSchema<String> {

    public StringSchema() {

    }

    public final StringSchema required() {
        checks.put("requiredString", str -> str != null && !str.isEmpty());
        return this;
    }

    public final StringSchema contains(String subStr) {
        checks.put("contains", str -> str.contains(subStr));
        return this;
    }

    public final StringSchema minLength(int minLength) {
        checks.put("minLength", str -> str.length() >= minLength);
        return this;
    }
}
