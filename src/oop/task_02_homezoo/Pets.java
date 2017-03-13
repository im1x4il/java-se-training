package oop.task_02_homezoo;

/**
 * Created by Михаил on 13.03.2017.
 */
public class Pets {
    public static void main(String[] args) {
        Pet[] myPets = {
                new Dog(12,4,"Sharic", Animal.Kind.natatorial,new Master("Vasia","Abramov",584646)),
                new Cat(5,4,"Barsik", Animal.Kind.natatorial,new Master("Kolia","Chikatini",48446464)),
                new Parrot(2,2,"Kesha", Animal.Kind.flying,new Master("Vitalka","Popov",544564))
        };

        for (Pet p : myPets) {
            System.out.printf("'%s'\n \t.weight = %d(kg)\n \t.legs = %d(лапы)\n \t.kind =%s(вид)\n \t.master phone number= %s %n",
                    p.getName(), p.getWeight() ,p.getLegs(),p.getKind());

        }
    }
}