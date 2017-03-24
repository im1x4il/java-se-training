package oop.task_05_kitchen.Kitchen;
import oop.task_05_kitchen.Dish.Dish;
import oop.task_05_kitchen.Dish.Ukainian_Dish;

public class Ukrainian_kitchen implements Kitchen {
    @Override
    public Dish make_dish() {
        return new Ukainian_Dish();
    }

}
