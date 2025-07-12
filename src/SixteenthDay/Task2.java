package SixteenthDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        for (int i = 1; i <= 1000; i++) {
            int randomNum = rand.nextInt(101);
            pw1.println(randomNum);
        }
        pw1.close();

        Scanner sc = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);

        double sum = 0;
        int interval = 20;
        int counter = 0;

        while (sc.hasNextLine()) {
            double num = Double.parseDouble(sc.nextLine());
            sum += num;
            counter++;

            if (counter == interval) {
                pw2.println(sum / interval);
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        double sum = 0;
        while (sc.hasNextLine()) {
            sum += Double.parseDouble(sc.nextLine());
        }
        System.out.println((int)sum);
    }
}
