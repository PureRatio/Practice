package FifteenthDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        Scanner scanner = new Scanner(file);

        File resultFile = new File("results.txt");
        PrintWriter writer = new PrintWriter(resultFile);

        while (scanner.hasNextLine()) {
            String [] array = scanner.nextLine().split(";");
            int quantity = Integer.parseInt(array[2]);
            if(quantity == 0){
                writer.println(String.join(", ", array));
            }
        }

        scanner.close();
        writer.close();
    }
}
