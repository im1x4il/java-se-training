package oop.task_01_figures;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Figures {
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle(10,12);
        Rectangle R2 = new Rectangle(8,14);

        Circle C1 = new Circle(6);
        Circle C2 = new Circle(8);
        Circle C3 = new Circle(10);

        Triangle T1 = new Triangle(4, 6, 8);
        Triangle T2 = new Triangle(5, 10, 15); //Плоский треугольник

        System.out.println(R1);
        System.out.println(R2);

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);

        System.out.println(T1);
        System.out.println(T2);
    }
}
