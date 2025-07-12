package SixteenthDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        printResult(file);
    }

    public static void printResult(File file){
        try{
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;

            for(String number: numbers)
                sum += Integer.parseInt(number);

            double average = (double) sum /numbers.length;

            System.out.printf("%f --> %.3f\n", average, average);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
