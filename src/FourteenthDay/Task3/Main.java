package FourteenthDay.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        List <Person> persons = new ArrayList<>();

        try{
            File file = new File("people.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");
                Person person = new Person(splitLine[0], Integer.parseInt(splitLine[1]));
                if (person.getAge() < 0) {
                    throw new IllegalArgumentException();
                }
                persons.add(person);
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

        return persons;
    }
}
