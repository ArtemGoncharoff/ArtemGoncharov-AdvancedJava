package org.example.task1;

import java.util.ArrayList;

import org.example.task1.animals.Animal;
import org.example.task1.animals.Dolphin;
import org.example.task1.animals.Eagle;
import org.example.task1.animals.Elephant;
import org.example.task1.animals.Human;
import org.example.task1.animals.Tiger;

public class PolymorphismDemonstrator {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Elephant());
        animals.add(new Eagle());
        animals.add(new Human());
        animals.add(new Dolphin());
        animals.add(new Tiger());
        for (Animal animal : animals) {
            animal.move();
            animal.eat();
            animal.sleep();
            System.out.println("____________________________________________________________________");
        }
    }
}
