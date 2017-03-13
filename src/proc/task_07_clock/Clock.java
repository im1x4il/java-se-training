package proc.task_07_clock;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Clock { /*Clock. На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
 оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
  когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
  (т.е. рабочий день закончился).Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
 Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
  сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
Итак, в программу передается n – целое число из [0;28800], далее оно должно выводиться на экран (для Петрова)
 и на следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.*/
    public static void main(String[] args) {
        double rundom =Math.random()*28800;
        /*int sec = Integer.parseInt(args[0]);
        int hour = sec/3600;
        int a =  sec;*/

        int a = (int) rundom;
        int c = a/3600;

        String b ="";

        if ( 3600>a && a>0 )
            b = " Часов ";             ///-0

        if ( 7200>a && a>3600 )
            b = " Час ";                ///-1

        if ( 10800 >a && a>7200 )
            b = " часа ";               ///-2

        if ( 14400>a && a>10800 )
            b = " Часа ";              ///-3

        if ( 18000>a && a>14400 )
            b = " Часа ";              ///-4

        if ( 21600>a && a>18000 )
            b = " Часов ";             ///-5

        if ( 25200>a && a> 21600 )
            b = " Часов ";             ///-6

        if ( 28800>a && a>25200 )
            b = " Часов ";             ///-7

        System.out.println("Время для Петрова : " + a);
        System.out.println("Осталось: " +c + b);
    }
}
