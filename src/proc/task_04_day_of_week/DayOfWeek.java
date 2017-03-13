package proc.task_04_day_of_week;

/**
 * Created by Михаил on 13.03.2017.
 */
public class DayOfWeek { //DayOFWeek. Вывести название дня недели по его номеру (аргумент командной
    public static void main(String[] args) {
        int dayNum = Integer.parseInt(args[0]);
        if (dayNum ==1)
            System.out.println("Понедельник");
        if (dayNum == 2)
            System.out.println("Вторник");
        if (dayNum == 3)
            System.out.println("Среда");
        if (dayNum == 4)
            System.out.println("Четверг");
        if (dayNum == 5)
            System.out.println("Пятница");
        if (dayNum == 6)
            System.out.println("Субота");
        if (dayNum == 7)
            System.out.println("Воскресенье");
        if (dayNum >7)
            System.out.println("Нет такого дня");

    }

}
