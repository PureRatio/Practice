package FourthDay;

import java.util.Random;

public class FourthTask {
    public static void main(String[] args) {
        int array [] = new int[100];
        int index = 0;
        int maxSum = Integer.MIN_VALUE;

        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        for(int i = 0; i < array.length-2; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if(sum > maxSum){
                maxSum = sum;
                index = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(index);
    }
}
