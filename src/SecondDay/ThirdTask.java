package SecondDay;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа a и b:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
            return;
        }

        int i = a + 1;
        while(i < b){
            if(i%5 == 0 && i%10 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
