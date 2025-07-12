package SixthDay;

public class Main
{
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "Blue", "Standart");

        Airplane airplane = new Airplane("Airbus", 1998, 74, 565);
        airplane.fillUp(10000);
        airplane.fillUp(9000);
        airplane.setYear(2005);
        airplane.setLength(75);

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

        motorbike.info();
        System.out.println(motorbike.yearDifference(2007));

        car.info();
        System.out.println(car.yearDifference(1937));

        airplane.info();

        Teacher teacher = new Teacher("Иван Васильевич", "история");
        Student student = new Student("Олег");

        teacher.evaluate(student);
    }
}
