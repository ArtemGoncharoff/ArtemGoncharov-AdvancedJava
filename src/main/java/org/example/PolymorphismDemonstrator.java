package org.example;

import org.example.animals.*;

import java.util.ArrayList;

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