package oop.task_03_homezoo2;

/**
 * Created by Михаил on 13.03.2017.
 */
class Pet extends Animal {
    private String name;
    // 1
    private String Master_Name;
    private String Master_Surname;
    private int Master_Phone_Number;
    // 2
    private Master master;

    //1
    public Pet(int weight, int legs, String name, Kind kind, String Master_Name, String Master_Surname, int Master_Phone_Number) {
        super(weight, legs, kind);
        this.name = name;
        this.Master_Name = Master_Name;
        this.Master_Surname = Master_Surname;
        this.Master_Phone_Number = Master_Phone_Number;
    }

    //2
    public Pet(int weight, int legs, String name, Kind kind, Master master) {
        super(weight, legs, kind);
        this.name = name;
        this.master = master;
        this.Master_Name = Master_Name;
        this.Master_Surname = Master_Surname;
        this.Master_Phone_Number = Master_Phone_Number;
    }
    public String getName() {
        return name;
    }
    public String getMaster_Name() {
        return Master_Name;
    }
    public String getMaster_Surname() {
        return Master_Surname;
    }
    public int getPhoneNumber() {
        return Master_Phone_Number;
    }

}