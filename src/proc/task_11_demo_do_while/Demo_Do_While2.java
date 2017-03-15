package proc.task_11_demo_do_while;

import java.util.Scanner;

/**
 * Created by Михаил on 15.03.2017.
 */
public class Demo_Do_While2 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
                if (i-1 != g) {
            do {
                System.out.print(g + " ");
                g--;
            } while (i-1 != g);
        } else {
            do {
                System.out.print(g + " ");
                g++;
            } while (i-1 != g);
        }
    }
}






