package proc.task_08_palindrome;

import java.util.Scanner;

/**
 * Created by Михаил on 14.03.2017.
 */
public class Palindrome {/*Palindrome. Дано четырехзначное число. Проверить, является ли оно палиндромом.
Примечание: палиндромом называется число, слово или текст, которые одинакового читаются слева направо и справа налево.
Например, в нашем случае это числа 1441, 5555, 7117 и т. д.
Примеры других чисел-палиндромов произвольной десятичной разрядности, не относящиеся к решаемой задаче: 3, 787, 11, 91519.*/

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int chislo1 = s.nextInt();
        String chislo2 = Integer.toString(chislo1);
        char chislo3 [] =chislo2.toCharArray();
        char c1 = chislo3[0];
        char c2 = chislo3[1];
        char c3 = chislo3[2];
        char c4 = chislo3[3];
        if (c1==c4 && c2==c3)
            System.out.println("Число является Полиндромом");
        else System.out.println("Число не является Полиндромом");

    }
}


