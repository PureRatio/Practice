package NinthDay.Task2;

import java.awt.*;

public abstract class Figure {
    String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
}
