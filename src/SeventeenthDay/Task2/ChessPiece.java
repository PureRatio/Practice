package SeventeenthDay.Task2;

public enum ChessPiece {
    KING_WHITE(100, '♔'),
    KING_BLACK(100, '♚'),
    QUEEN_WHITE(9,'♕'),
    QUEEN_BLACK(9,'♛'),
    ROOK_WHITE(5,'♖'),
    ROOK_BLACK(5,'♜'),
    BISHOP_WHITE(3.5,'♗'),
    BISHOP_BLACK(3.5,'♝'),
    KNIGHT_WHITE(3,'♘'),
    KNIGHT_BLACK(3,'♞'),
    PAWN_WHITE(1,'♙'),
    PAWN_BLACK(1,'♟'),
    EMPTY(-1,'_');

    private final double value;
    private final char symbol;

    ChessPiece(double value, char symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
