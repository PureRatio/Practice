package FinalProject;

import java.util.Scanner;

public class Main {
    static Player player1;
    static Player player2;
    static Player currentPlayer;

    public static void main(String[] args) {
        GameRules gameRules = new GameRules();
        GameBoard gameBoard1 = new GameBoard(gameRules);
        GameBoard gameBoard2 = new GameBoard(gameRules);

        player1 = new Player(gameBoard1);
        player2 = new Player(gameBoard2);

        promptPlayerName(player1);
        promptPlayerName(player2);

        fillBoard(player1, gameRules);
        fillBoard(player2, gameRules);
        currentPlayer = Math.random() > 0.5 ? player1 : player2;
        while (getTargetPlayer().gameBoard.hasAliveShips()) {
            Scanner sc = new Scanner(System.in);
            HitResult hitResult = HitResult.NONE;
            System.out.printf("Сейчас ходит %s\n", currentPlayer.name);
            while (hitResult == HitResult.NONE) {
                String input = sc.nextLine();
                try {
                    hitResult = getTargetPlayer().gameBoard.shot(parseCoordinate(input));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            switch (hitResult) {
                case HIT:
                    System.out.println("Попадание!");
                case DESTROYED:
                    System.out.println("Утопил!");
                    break;
                case MISS:
                    System.out.println("Мимо!");
                    switchPlayer();
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Победил %s !\n", currentPlayer.name);
        System.out.printf("Поле игрока %s\n%s\n", player1.name, player1.gameBoard);
        System.out.printf("Поле игрока %s\n%s\n", player2.name, player2.gameBoard);
    }

    public static String getShipSizeStr(int shipSize) {
        return switch (shipSize) {
            case 1 -> "однопалубного";
            case 2 -> "двухпалубного";
            case 3 -> "трехпалубного";
            case 4 -> "четырёхпалубного";
            default -> "сколько-то палубного";
        };
    }

    public static String getShipNumberStr(int shipIndex) {
        return switch (shipIndex + 1) {
            case 1 -> "первого";
            case 2 -> "второго";
            case 3 -> "третьего";
            case 4 -> "четвертого";
            default -> "какого-то по счёту";
        };
    }

    public static String getShipInputFormat(int shipSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shipSize; i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append("x,y");
        }
        return sb.toString();
    }

    public static void switchPlayer() {
        if (currentPlayer == player1)
            currentPlayer = player2;
        else
            currentPlayer = player1;
    }

    public static void fillBoard(Player player, GameRules gameRules) {
        Scanner sc = new Scanner(System.in);
        for (int i = gameRules.shipsCounts.length - 1; i >= 0; i--) {
            for (int j = 0; j < gameRules.shipsCounts[i]; j++) {
                boolean isShipAccepted = false;
                while (!isShipAccepted) {
                    if (gameRules.shipsCounts[i] == 1)
                        System.out.printf("%s, введите координаты %s корабля (формат: %s)\n", player.name, getShipSizeStr(i), getShipInputFormat(i));
                    else
                        System.out.printf("%s, введите координаты %s %s корабля (формат: %s)\n", player.name, getShipNumberStr(j), getShipSizeStr(i), getShipInputFormat(i));
                    Coordinate[] coordinates = new Coordinate[i];
                    String line = sc.nextLine();
                    String[] cellArray = line.split(";");
                    if (cellArray.length != i)
                        System.out.printf("Ошибка: неверное количество ячеек у корабля, у корабля должно быть %d ячейка(и)\n", i);
                    try {
                        for (int k = 0; k < cellArray.length; k++) {
                            coordinates[k] = parseCoordinate(cellArray[k]);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    try {
                        player.gameBoard.addShip(coordinates);
                        isShipAccepted = true;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public static Player getTargetPlayer() {
        if (currentPlayer == player1)
            return player2;
        else
            return player1;
    }

    public static Coordinate parseCoordinate(String coordinate) {
        String[] coordinateArray = coordinate.split(",");
        if (coordinateArray.length != 2)
            throw new IllegalArgumentException("Ошибка: у координат должны быть два компонента: х и у");
        int x;
        try {
            x = Integer.parseInt(coordinateArray[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("Ошибка: %s координата должна быть числом", coordinateArray[0]));
        }
        int y;
        try {
            y = Integer.parseInt(coordinateArray[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("Ошибка: %s координата должна быть числом", coordinateArray[1]));
        }
        return new Coordinate(x, y);
    }

    public static void promptPlayerName(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        player.name = sc.nextLine();
    }
}
