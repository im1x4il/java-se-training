package proc.task_06_min5;

import java.util.Scanner;

/**
 * Created by Михаил on 11.02.2017.
 */
public class Min5 {
    public static void main(String[] args) {
        int a, b, c, d, f;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        d = new Scanner(System.in).nextInt();
        f = new Scanner(System.in).nextInt();

        if (a < b && a < c && a < d && a < f) System.out.println(a);
        if (b < a && b < c && b < d && b < f) System.out.println(c);
        if (c < a && c < b && c < d && c < f) System.out.println(c);
        if (d < a && d < b && d < c && d < f) System.out.println(d);
        if (f < a && f < b && f < c && f < d) System.out.println(f);

    }
}