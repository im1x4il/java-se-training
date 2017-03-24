package oop.task_05_kitchen;
import oop.task_05_kitchen.Dish.Dish;
import oop.task_05_kitchen.Dish.Italian_Dish;
import oop.task_05_kitchen.Dish.Japan_Dish;
import oop.task_05_kitchen.Dish.Ukainian_Dish;
import oop.task_05_kitchen.Kitchen.Italian_kitchen;
import oop.task_05_kitchen.Kitchen.Japan_kitchen;
import oop.task_05_kitchen.Kitchen.Kitchen;
import oop.task_05_kitchen.Kitchen.Ukrainian_kitchen;

import java.util.Scanner;

/**
 * Created by Михаил on 24.03.2017.
 */
public class Menu {

    public static void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Choice Kitchen:");
        System.out.println("1 Ukrainian Kitchen");
        System.out.println("2 Italian Kitchen");
        System.out.println("3 Japan Kitchen");
        int Choise = s.nextInt();
        if(Choise ==1) {
            Kitchen kitchen = new Ukrainian_kitchen();
            Dish dish = new Ukainian_Dish();
            dish.showDish();}

        if (Choise ==2){
            Kitchen kitchen = new Italian_kitchen();
            Dish dish = new Italian_Dish();
            dish.showDish();}

        if (Choise ==3){
            Kitchen kitchen = new Japan_kitchen();
            Dish dish = new Japan_Dish();
            dish.showDish();}

        if (Choise!=1 && Choise!=2 && Choise!=3){
            System.out.println("Not the right choice, try again");
            Menu.menu();}
    }

}
