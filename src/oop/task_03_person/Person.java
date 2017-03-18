package oop.task_03_person;

/**
 * Created by Михаил on 18.03.2017.
 */

public class Person implements Comparable {
    private int age;
    private String name;
    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {return age;}
    public String getName() {return name;}



    @Override
    public int compareTo(Object o) {
        double y = 10.1;
        int x = (int) y;


        Person etot=this;
        Person drugoy= (Person) o;

        if(etot.getAge()>drugoy.getAge())
            return 1;
        if (etot.getAge()<drugoy.getAge())
            return -1;
        else
            return 0;

    }
}

