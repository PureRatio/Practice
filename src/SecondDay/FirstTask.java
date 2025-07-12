package SecondDay;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество этажей дома:");

        int floor = sc.nextInt();

        if (floor >= 1 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        }
        if (floor <= 0){
            System.out.println("Ошибка ввода");
        }
    }
}
