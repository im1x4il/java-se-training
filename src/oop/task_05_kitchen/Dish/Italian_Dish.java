package oop.task_05_kitchen.Dish;

import oop.task_05_kitchen.Kitchen.Italian_kitchen;
import oop.task_05_kitchen.Kitchen.Kitchen;

import java.util.Scanner;

public class Italian_Dish implements Dish {
    @Override
    public void showDish() {
        Scanner s = new Scanner(System.in);
        System.out.println("Italian Kitchen");
        System.out.println("Choice Dish:");
        System.out.println("1 Лазанья");
        System.out.println("2 Пицца");
        System.out.println("3 Ризотто");
        int Choice = s.nextInt();
        if (Choice == 1) {
            System.out.println("Your choice is: 'Лазанья' ");
        }
        if (Choice == 2) {
            System.out.println("Your choice is: 'Пицца' ");
        }

        if (Choice == 3) {
            System.out.println("Your choice is: 'Ризотто' ");
        }

        if (Choice != 1 && Choice != 2 && Choice != 3) {
            System.out.println("Not the right choice, try again");
            Kitchen kitchen = new Italian_kitchen();
            Dish dish = new Italian_Dish();
            dish.showDish();
        }
    }

}


