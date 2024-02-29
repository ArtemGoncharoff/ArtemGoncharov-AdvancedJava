package org.example.task1.animals;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("The human ran 100 meters");
    }

    @Override
    public void eat() {
        System.out.println("The human took out and ate food from the refrigerator");
    }

    @Override
    public void sleep() {
        System.out.println("The man went to bed and slept for 7 hours");
    }
}
