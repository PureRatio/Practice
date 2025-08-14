package FinalProject;

public enum CellState {
    EMPTY("\u200B⬜"),
    BUFFER("\uD83D\uDFE6"),
    SHIP_BODY("\uD83D\uDEE5"),
    HIT_EMPTY("\u1F532"),
    HIT_BUFFER("\u1F532"),
    HIT_SHIP_BODY("\uD83D\uDFE5");

    private final String symbol;

    CellState(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
