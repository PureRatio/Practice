package ThirdDay;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if(b == 0){
                break;
            }

            System.out.println(a/b);
        }
    }

}
