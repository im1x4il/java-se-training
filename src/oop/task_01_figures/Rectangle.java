package oop.task_01_figures;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Rectangle {
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double area() {
        double area = getWeight() * getHeight();
        return area;
    }
    public String toString() {
        String R = "Прямоугольник " + getWeight() + " на " + getHeight() + " px с площадью " + area();
        return R;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight(){
        return this.height;
    }
}