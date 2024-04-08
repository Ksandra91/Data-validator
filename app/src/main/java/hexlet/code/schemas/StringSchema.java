package hexlet.code.schemas;

public class StringSchema {

    private boolean isRequired = false;
    private boolean isMin = false;
    private int minLen;
    private boolean isContains = false;
    private String cont;


    public StringSchema() {

    }

    public void required() {
        this.isRequired = true;
    }

    public StringSchema minLength(int min) {
        this.isMin = true;
        this.minLen = min;
        return this;
    }

    public StringSchema contains(String str) {
        this.cont = str;
        this.isContains = true;
        return this;
    }

    public boolean isValid(String str) {
        boolean param1 = true;
        boolean param2 = true;
        boolean param3 = true;

        if (isRequired) {
            if (str == null || str.isEmpty()) {
                param1 = false;
            }
        }
        if (isMin) {
            assert str != null;
            if (str.length() < minLen) {
                param2 = false;
            }
        }

        if (isContains) {
            assert str != null;
            if (!str.contains(cont)) {
                param3 = false;
            }
        }

        return param1 && param2 && param3;
    }

}
