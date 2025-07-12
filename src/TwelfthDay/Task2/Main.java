package TwelfthDay.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i <= 350; i+=2) {
            if(i > 30 && i < 300)
                continue;
            evenNumbers.add(i);
        }

        System.out.println(evenNumbers);
    }
}
