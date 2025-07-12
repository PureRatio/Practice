package FifthDay;

public class Main
{
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "Blue", "Standart");

        Car car = new Car();
        car.setProductionYear(2025);
        car.setColor("Red");
        car.setModel("Sedan");

        System.out.println(car.getProductionYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        System.out.println(motorbike.getProductionYear());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
