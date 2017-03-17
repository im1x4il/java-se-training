package proc.task_11_demo_do_while;

import java.util.Scanner;

/**
 * Created by Михаил on 17.03.2017.
 */
public class Demo_Do_While3 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
        int index = 0;
        int array[] = new int[1000];
        if (i < g) {
            do {
                index++;
                if (index % 2 == 0) {
                    array[index] = g;
                    g--;
                }
                System.out.println(array[index]);
            } while (i != g);
        } else {
            do {
                index++;
                if (index % 2 == 0) {
                    array[index] = g;
                    g++;
                }
                System.out.println(array[index]);
            } while (i - 1 != g);
        }
    }
}
