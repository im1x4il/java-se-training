package oop.task_05_kitchen.Kitchen;
import oop.task_05_kitchen.Dish.Dish;
import oop.task_05_kitchen.Dish.Japan_Dish;

public class Japan_kitchen implements Kitchen {

    @Override
    public Dish make_dish() {
        return new Japan_Dish();
    }
}
