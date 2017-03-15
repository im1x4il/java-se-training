package proc.task_10_demo_while;

import java.util.Scanner;

/**
 * Created by Михаил on 15.03.2017.
 */
public class DemoWhile {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
                if (i >= g) {
            while (i >= g) {
                System.out.print(i + " ");
                i--;
            }
        } else {
            while (i <= g) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}