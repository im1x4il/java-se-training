package proc.task_01_max2;

import java.util.Scanner;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Max2 {
    public static void main(String[] args) {
        int a, b;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();


        if (a < b) System.out.println(b);
         else System.out.println(a);


    }
}