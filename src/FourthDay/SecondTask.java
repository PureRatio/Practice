package FourthDay;

import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {
        int array [] = new int[100];

        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxElement = 0;
        for(int element : array){
            if (element > maxElement)
                maxElement = element;
        }
        System.out.printf("Наибольший элемент массива: %d \n", maxElement);

        int minElement = Integer.MAX_VALUE;
        for(int element : array){
            if (element < minElement)
                minElement = element;
        }
        System.out.printf("Наименьший элемент массива: %d \n", minElement);

        int zeroEndingCount = 0;
        for(int element : array){
            if (element % 10 == 0)
                zeroEndingCount++;
        }
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d \n", zeroEndingCount);

        int zeroEndingSum = 0;
        for(int element : array){
            if (element % 10 == 0)
                zeroEndingSum += element;
        }
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d \n", zeroEndingSum);
    }
}
