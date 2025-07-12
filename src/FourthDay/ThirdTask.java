package FourthDay;

import java.util.Random;

public class ThirdTask {
    public static void main(String[] args) {
        int array [][] = new int [12][8];
        int index = 0;
        int maxSum = Integer.MIN_VALUE;

        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(50);

        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = 0; j < array[i].length; j++)
                sum += array[i][j];

            if(maxSum <= sum) {
                maxSum = sum;
                index = i;
            }
        }

        System.out.println(index);
    }
}
