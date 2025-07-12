package SeventhDay;

import java.util.Random;

public class Player {
    int stamina;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    static int countPlayers = 0;

    public Player() {
        stamina = new Random().nextInt(11) + 90;
        if(countPlayers < 6){
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 0) {
            stamina --;
            if (stamina <= 0) {
                countPlayers--;
            }
        }
    }

    public static void info(){
        if(countPlayers < 6){
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", 6 - countPlayers);
        }
        else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
