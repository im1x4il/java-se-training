package proc.task_10_demo_while;

import java.util.Scanner;

/**
 * Created by Михаил on 15.03.2017.
 */
public class DemoWhile3 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
        int index=0;
        int array [] = new int[1000];
        if (i < g) {

            while (i != g) {
                index++;
                if (index %2==0) {
                    array[index]=g;
                    g--;
                }
                System.out.println(array[index]);
            }
        } else {
            while (i != g) {
                index++;
                if (index%2==0){

                    array[index]=g;
                    g++;
                }
                System.out.println(array[index]);
            }
        }
    }
}
