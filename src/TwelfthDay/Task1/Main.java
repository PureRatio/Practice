package TwelfthDay.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("Toyota");
        carBrands.add("Audi");
        carBrands.add("BMW");
        carBrands.add("Honda");
        carBrands.add("Ford");
        System.out.println(carBrands);

        carBrands.add(2, "Volvo");
        carBrands.remove(0);
        System.out.println(carBrands);
    }
}
