package oop.task_02_homezoo;

/**
 * Created by Михаил on 13.03.2017.
 */
class Pet extends Animal {
    private String name;
    private Master master;


    public Pet(int weight, int legs, String name, Kind kind, Master master) {
        super(weight, legs, kind);
        this.name = name;
        this.master = master;
    }

    public String getName() {
        return name;
    }
}




