package oop.task_03_homezoo2;

/**
 * Created by Михаил on 13.03.2017.
 */
class Cat extends Pet {
    public Cat(int weight, int legs, String name, Kind kind, Master master ) {
        super(weight,legs,name,kind,master);
    }
    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}