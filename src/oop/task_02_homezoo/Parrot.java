package oop.task_02_homezoo;

/**
 * Created by Михаил on 13.03.2017.
 */
class Parrot extends Pet {
    public Parrot(int weight, int legs, String name, Kind kind, Master master ) {
        super(weight,legs,name,kind, master);
    }
    public void canfly() {
        System.out.println("Catching mice...");
    }
}