package proc.task_05_min4;

import java.util.Scanner;

/**
 * Created by Михаил on 11.02.2017.
 */
public class Min4 {
    public static void main(String[] args) {
        int a, b, c, d, f;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        d = new Scanner(System.in).nextInt();

        if (a < b && a < c && a < d) System.out.println(a);
        if (b < a && b < c && b < d) System.out.println(c);
        if (c < a && c < b && c < d) System.out.println(c);
        if (d < a && d < b && d < c) System.out.println(d);

    }
}