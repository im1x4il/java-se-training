package proc.task_10_demo_while;

import java.util.Scanner;

/**
 * Created by Михаил on 15.03.2017.
 */
public class DemoWhile2{
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
        if (i >= g) {
            while (i-1 != g) {
                System.out.print(g + " ");
                g++;
            }
        } else {
            while (i-1 != g) {
                System.out.print(g + " ");
                g--;

            }
        }

    }
}

