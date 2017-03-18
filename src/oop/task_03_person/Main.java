package oop.task_03_person;

import java.util.Arrays;

/**
 * Created by Михаил on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person[] myfriens = {
                new Person(22, "Stas"),
                new Person(30, "Aleksand"),
                new Person(24, "Vika"),
                new Person(18, "Igor"),
                new Person(20, "Victor"),
        };
        Arrays.sort(myfriens);
        String line = Arrays.toString(myfriens);
        System.out.println(line);
        for (Person p : myfriens) {
            System.out.println("Person: Age " + p.getAge() + " Name " + p.getName());
        }
    }
}
