package proc.task_11_demo_do_while;

import java.util.Scanner;

/**
 * Created by Михаил on 15.03.2017.
 */
public class Demo_Do_While {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
        if (i >= g) {
            do {
                System.out.print(i + " ");
                i--;
            } while (i >= g);
        } else {
            do {
                System.out.print(i + " ");
                i++;
            } while (i <= g);
        }
    }
}