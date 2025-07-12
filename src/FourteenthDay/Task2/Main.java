package FourteenthDay.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        List <String> lines = new ArrayList<>();

        try{
            File file = new File("people.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String age = line.split(" ")[1];
                int ageInt = Integer.parseInt(age);
                if (ageInt < 0) {
                    throw new IllegalArgumentException();
                }
                lines.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

        return lines;
    }
}
