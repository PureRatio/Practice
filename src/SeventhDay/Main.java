package SeventhDay;

public class Main
{
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1998, 74, 565);
        airplane1.fillUp(10000);
        airplane1.fillUp(9000);
        airplane1.setYear(2005);
        airplane1.setLength(75);
        Airplane airplane2 = new Airplane("Boing", 2000, 72, 555);

        airplane1.info();

        Airplane.compareAirplanes(airplane1, airplane2);

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player vasya = new Player();
        Player.info();

        Player player7 = new Player();

        while (vasya.getStamina() > 0){
            vasya.run();
        }

        System.out.println(Player.countPlayers);
    }
}
