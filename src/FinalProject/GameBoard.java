package FinalProject;

import java.util.Arrays;

public class GameBoard {
    CellState[][] board;

    public GameBoard() {
        this.board = new CellState[10][10];
    }

    public void addShip(Coordinate[] coordinates) {
        for(Coordinate coord : coordinates) {
            board[coord.y][coord.x] = CellState.SHIP_BODY;
        }
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}
