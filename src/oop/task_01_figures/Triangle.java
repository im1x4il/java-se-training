package oop.task_01_figures;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Triangle {
    private double storona1;
    private double storona2;
    private double storona3;

    public Triangle(double storona1, double storona2, double storona3) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }
    public double area() {
        double perimetr = (getStorona1() + getStorona2() + getStorona3()) / 2;
        double area = Math.sqrt((perimetr*perimetr-getStorona1())*(perimetr-getStorona2())*(perimetr-getStorona3()));
        return area;
    }
    public String toString() {
        String T = "Триугольник с сторонами " + getStorona1() + " , " + getStorona2() + " , " + getStorona3() + " px с площадью " + area();
        return T;
    }
    public double getStorona1(){
        return this.storona1;
    }
    public double getStorona2(){
        return this.storona2;
    }
    public double getStorona3(){
        return this.storona3;
    }
}
