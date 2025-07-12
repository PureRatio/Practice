package SeventeenthDay.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChessPiece[] array = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece chessPiece : array) {
            System.out.print(chessPiece + " ");
        }
    }
}
