package SixthDay;

public class Motorbike
{
    int productionYear;
    String color;
    String model;

    public Motorbike(int productionYear, String color, String model){
        this.productionYear = productionYear;
        this.color = color;
        this.model = model;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - productionYear);
    }
}
