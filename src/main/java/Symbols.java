public enum Symbols {
    CHERRY(10),
    BELL(30),
    LEMON(40),
    BAR(50),
    SEVEN(100),;

    private final int value;
    Symbols(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
