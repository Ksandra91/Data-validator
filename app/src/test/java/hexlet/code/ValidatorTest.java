package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
    @Test

    public void test1() {
        var v = new Validator();
        var schema = v.string();
        boolean result = schema.minLength(10).minLength(4).isValid("Hexlet");
        assertTrue(result);
    }
}
