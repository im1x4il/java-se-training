package oop.task_05_kitchen.Kitchen;
import oop.task_05_kitchen.Dish.Dish;
import oop.task_05_kitchen.Dish.Italian_Dish;

public class Italian_kitchen implements Kitchen {
    @Override
    public Dish make_dish() {
        return new Italian_Dish();
    }
}
