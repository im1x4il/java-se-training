package proc.task_03_max3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Max3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print ("Введите а ");
        int a = s.nextInt();
        System.out.print ("Введите b ");
        int b = s.nextInt();
        System.out.print ("Введите с ");
        int c = s.nextInt();

        if (a>b)
            if (a>c)
                System.out.println("Найбольшее а:"+a);
        if (b>a)
            if (b>c)
                System.out.println("Найбольшее b:"+b);
        if (c>a)
            if (c>b)
                System.out.println("Найбольшее с:"+c);

    }
}/*Max3. Запросить три числа. Вывести на экран то из них, которое больше. <MAX3 Схема>*/
