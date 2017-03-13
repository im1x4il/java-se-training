package proc.task_02_proximal;

import java.util.Scanner;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Proximal {
    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);//1
      int b = Integer.parseInt(args[1]);//5
      int c = 6;
      int ac = Math.abs(c-a) ;
      int bc = Math.abs(c-b) ;

      if (ac<bc)
          System.out.println("a");
      if (ac>bc)
          System.out.println("b");

    }
    /*Proximal. Передается 2 числа – координаты 2х точек на оси X. Точки A, затем точки B.
    Точка C имеет смещение 6 на оси. Вывести название той точки, которая ближе всего к C.*/
}
