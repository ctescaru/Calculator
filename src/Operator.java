public enum Operator {
    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARENTHESES("(", ")");

    private String sign;
    private String startSign;
    private String endSign;

    private Operator(String sign) {
        this.sign = sign;
    }

    Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getSign() {
        return sign;
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }

    public static Operator[] getValues() {
        return new Operator[]{PARENTHESES, ADD, SUBTRACT, MULTIPLY, DIVIDE};
    }
}
