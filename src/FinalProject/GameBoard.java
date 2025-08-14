package FinalProject;

import java.util.*;

public class GameBoard {
    CellState[][] board;
    final int boardSizeX;
    final int boardSizeY;
    List<Coordinate[]> ships = new ArrayList<>();

    public GameBoard(GameRules rules) {
        boardSizeX = rules.boardSizeX;
        boardSizeY = rules.boardSizeY;
        this.board = new CellState[boardSizeY][boardSizeX];
        for (CellState[] cellStates : board) {
            Arrays.fill(cellStates, CellState.EMPTY);
        }
    }

    private void validateShip(Coordinate[] coordinates) {
        boolean isVertical = true;
        boolean isHorizontal = true;
        boolean isShipContinuous;

        for (Coordinate coord : coordinates) {
            if (coord.x < 0 || coord.x >= boardSizeX || coord.y < 0 || coord.y >= boardSizeY)
                throw new IllegalArgumentException(String.format("Ошибка: координаты должны быть от 0 до %d включительно.", boardSizeX - 1));
        }

        for (Coordinate coord : coordinates) {
            isVertical = coord.x == coordinates[0].x;
            if (!isVertical)
                break;
        }

        for (Coordinate coord : coordinates) {
            isHorizontal = coord.y == coordinates[0].y;
            if (!isHorizontal)
                break;
        }

        if (!(isVertical || isHorizontal))
            throw new IllegalArgumentException("Ошибка: корабль должен располагаться строго по горизонтали или вертикали.");

        if (isHorizontal) {
            Arrays.sort(coordinates, Comparator.comparingInt(p -> p.x));
            for (int i = 1; i < coordinates.length; i++) {
                isShipContinuous = coordinates[i].x - coordinates[i - 1].x == 1;
                if (!isShipContinuous)
                    throw new IllegalArgumentException("Ошибка: координаты корабля должны образовывать непрерывную последовательность.");
            }
        }
        if (isVertical) {
            Arrays.sort(coordinates, Comparator.comparingInt(p -> p.y));
            for (int i = 1; i < coordinates.length; i++) {
                isShipContinuous = coordinates[i].y - coordinates[i - 1].y == 1;
                if (!isShipContinuous)
                    throw new IllegalArgumentException("Ошибка: координаты корабля должны образовывать непрерывную последовательность.");
            }
        }

    }

    public void addShip(Coordinate[] coordinates) {
        validateShip(coordinates);
        addBuffer(coordinates);
        for (Coordinate coord : coordinates) {
            board[coord.y][coord.x] = CellState.SHIP_BODY;
        }
        ships.add(coordinates);
    }

    private void addBuffer(Coordinate[] coordinates) {
        Set<Coordinate> bufferSet = new HashSet<>();
        for (Coordinate coord : coordinates) {
            bufferSet.add(coord);
            for (int i = -1; i <= 1; i++)
                for (int j = -1; j <= 1; j++)
                    bufferSet.add(new Coordinate(coord.x + i, coord.y + j));
        }

        for (Coordinate coord : bufferSet) {
            if (coord.x < 0 || coord.x >= boardSizeX || coord.y < 0 || coord.y >= boardSizeY)
                continue;
            else {
                if (board[coord.y][coord.x] == CellState.SHIP_BODY)
                    throw new IllegalArgumentException("Ошибка: между кораблями должна быть как минимум одна пустая клетка");
            }
        }

        for (Coordinate coord : bufferSet) {
            if (coord.x < 0 || coord.x >= boardSizeX || coord.y < 0 || coord.y >= boardSizeY)
                continue;
            else {
                board[coord.y][coord.x] = CellState.BUFFER;
            }
        }
    }

    public HitResult shot(Coordinate coord) {
        validateShot(coord);
        if (board[coord.y][coord.x] == CellState.SHIP_BODY) {
            board[coord.y][coord.x] = CellState.HIT_SHIP_BODY;
            if (isShipDestroyed(coord))
                return HitResult.DESTROYED;
            else
                return HitResult.HIT;
        } else if (board[coord.y][coord.x] == CellState.BUFFER)
            board[coord.y][coord.x] = CellState.HIT_BUFFER;
        else if (board[coord.y][coord.x] == CellState.EMPTY)
            board[coord.y][coord.x] = CellState.HIT_EMPTY;
        return HitResult.MISS;
    }

    public boolean isShipDestroyed(Coordinate coord) {
        for (Coordinate[] ship : ships) {
            if (containCoordinate(coord, ship))
                if (isAlive(ship))
                    return false;
        }
        return true;
    }

    public boolean containCoordinate(Coordinate coord, Coordinate[] ship) {
        for (Coordinate shipPart : ship) {
            if (shipPart.x == coord.x && shipPart.y == coord.y) {
                return true;
            }
        }
        return false;
    }

    public boolean isAlive(Coordinate[] ship) {
        for (Coordinate coord : ship) {
            if (board[coord.y][coord.x] == CellState.SHIP_BODY)
                return true;
        }
        return false;
    }

    public void validateShot(Coordinate coord) {
        if (coord.x < 0 || coord.x >= boardSizeX || coord.y < 0 || coord.y >= boardSizeY)
            throw new IllegalArgumentException(String.format("Ошибка: координаты для нанесения удара должны быть от 0 до %d включительно.", boardSizeX - 1));
    }

    public boolean hasAliveShips(){
        for (Coordinate[] ship : ships) {
            if(isAlive(ship))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (CellState[] cellStates : board) {
            for (CellState cellState : cellStates) {
                sb.append(cellState);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
