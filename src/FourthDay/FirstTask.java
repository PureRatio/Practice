package FourthDay;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int array [] = new int[arrayLength];

        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));

        System.out.printf("Длина массива: %d\n", arrayLength);

        int countGreaterThan8 = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] > 8)
                countGreaterThan8 ++;

        System.out.printf("Количество чисел больше 8: %d\n", countGreaterThan8);

        int countOnes = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] == 1)
                countOnes ++;

        System.out.printf("Количество чисел равных 1: %d\n", countOnes);

        int evenCount = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] % 2 == 0)
                evenCount ++;

        System.out.printf("Количество четных чисел: %d\n", evenCount);

        int oddCount = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] % 2 != 0)
                oddCount ++;

        System.out.printf("Количество нечетных чисел: %d\n", oddCount);

        int sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.printf("Сумма всех элементов массива: %d\n", sum);
    }
}
