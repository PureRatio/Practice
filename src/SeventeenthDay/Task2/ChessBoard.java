package SeventeenthDay.Task2;

public class ChessBoard {
    ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard){
        this.chessBoard = chessBoard;
    }

    public void print(){
        for(ChessPiece[] row : chessBoard){
            for(ChessPiece piece : row){
                System.out.print(piece);
            }
            System.out.println();
        }
    }
}
