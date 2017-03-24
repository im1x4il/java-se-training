package oop.task_05_kitchen.Dish;
import oop.task_05_kitchen.Kitchen.Japan_kitchen;
import oop.task_05_kitchen.Kitchen.Kitchen;
import java.util.Scanner;

public class Japan_Dish implements Dish {
    @Override
    public void showDish() {
        Scanner s = new Scanner(System.in);
        System.out.println("Japan Kitchen");
        System.out.println("Choice Dish:");
        System.out.println("1 Суп 'Дзони'");
        System.out.println("2 Суши");
        System.out.println("3 Лапша 'Удон'");
        int Choice = s.nextInt();
        if(Choice ==1) {
            System.out.println("Your choice is: Суп 'Дзони' ");
        }
        if (Choice ==2){
            System.out.println("Your choice is: 'Суши' ");
        }

        if (Choice ==3){
            System.out.println("Your choice is: 'Лапша 'Удон' ");
        }

        if (Choice!=1 && Choice!=2 && Choice!=3){
            System.out.println("Not the right choice, try again");
            Kitchen kitchen = new Japan_kitchen();
            Dish dish = new Japan_Dish();
            dish.showDish();}
    }
}