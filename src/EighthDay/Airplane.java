package EighthDay;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void fillUp(int fuelToAdd ) {
        this.fuel += fuelToAdd;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d\n", producer, year, length, weight, fuel);
    }

    @Override
    public String toString() {
        return String.format("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d\n", producer, year, length, weight, fuel);
    }
}
