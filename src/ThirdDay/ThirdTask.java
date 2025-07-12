package ThirdDay;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if(b == 0){
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a/b);
        }
    }
}
