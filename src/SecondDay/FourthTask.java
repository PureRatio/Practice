package SecondDay;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        double y = 420;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите x:");

        double x = sc.nextDouble();

        if(x >= 5){
            y = (Math.pow(x, 2)-10)/(x + 7);
        }
        if(x < 5 && x > -3){
            y = ((x + 3)*Math.pow(x, 2)-2);
        }

        System.out.println("y равен: " + y);
    }
}
