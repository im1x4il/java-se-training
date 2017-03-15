package proc.task_09_quadraticequation;

/**
 * Created by Михаил on 14.03.2017.
 */
public class QuadraticEquation {/*QuadraticEquation. Даны вещественные числа a, b и c, причем a отлично от 0.
    Решить квадратное уравнение ax2 + bx + c = 0 или сообщить о том, что действительных решений нет.
    Квадратный корень числа в Java можно получить с помощью: double root = Math.sqrt(4); */
    public static void main (String[] args) {
        double a = 3;
        double b = 5;
        double c = 1;

        double d = (b*b)-( 4*a*c);
        double x1=(-b+(Math.sqrt(d)))/( 2*a);
        double x2=(-b-(Math.sqrt(d)))/( 2*a);

        if (Double.isInfinite(x1))
            System.out.println("x1 = действительных решений нет");

        else if (Double.isNaN(x1)){
            System.out.println("x1 = действительных решений нет");}
        else
            System.out.println("x1 = " + x1);

        if (Double.isInfinite(x2))
            System.out.println("x2 = действительных решений нет");

        else if (Double.isNaN(x2)){
            System.out.println("x2 = действительных решений нет");}
        else
            System.out.println("x2 = "+x2);
    }

}

