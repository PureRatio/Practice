package SixthDay;

public class Car
{
    int productionYear;
    String color;
    String model;

    public void setProductionYear(int productionYear){
        this.productionYear = productionYear;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String model){
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
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - productionYear);
    }
}
