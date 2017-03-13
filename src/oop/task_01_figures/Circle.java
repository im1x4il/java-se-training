package oop.task_01_figures;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        double area = radius * Math.PI;
        return area;
    }
    public String toString() {
        String C = "Круг " + getRadius() + " px с площадью " + area();
        return C;
    }
    public double getRadius(){
        return this.radius;
    }
}