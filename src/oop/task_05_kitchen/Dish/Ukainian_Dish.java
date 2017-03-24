package oop.task_05_kitchen.Dish;
import oop.task_05_kitchen.Kitchen.Kitchen;
import oop.task_05_kitchen.Kitchen.Ukrainian_kitchen;
import java.util.Scanner;

public class Ukainian_Dish implements Dish {
    @Override
    public void showDish() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ukrainian Kitchen");
        System.out.println("Choice Dish:");
        System.out.println("1 Борщ");
        System.out.println("2 Сало");
        System.out.println("3 Деруни");
        int Choice = s.nextInt();
        if(Choice ==1) {
            System.out.println("Your choice is: 'Борщ' ");}

        if (Choice ==2){
            System.out.println("Your choice is: 'Сало' ");}

        if (Choice ==3){
            System.out.println("Your choice is: 'Деруны' ");}

        if (Choice!=1 && Choice!=2 && Choice!=3){
            System.out.println("Not the right choice, try again");
            Kitchen kitchen = new Ukrainian_kitchen();
            Dish dish = new Ukainian_Dish();
            dish.showDish();}
    }
}
