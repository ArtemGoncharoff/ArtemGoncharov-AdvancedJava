package org.example.task1.animals;

public class Elephant extends Animal {
    @Override
    public void move() {
        System.out.println("The elephant ran 1000 meters ");
    }

    @Override
    public void eat() {
        System.out.println("The elephant broke a branch and ate the leaves");
    }

    @Override
    public void sleep() {
        System.out.println("The elephant lay down on the ground and slept for 2 hours");
    }
}
