package org.example.task1.animals;

public class Dolphin extends Animal {
    @Override
    public void move() {
        System.out.println("The dolphin swam 4 km");
    }

    @Override
    public void eat() {
        System.out.println("The dolphin caught the fish and ate it");
    }

    @Override
    public void sleep() {
        System.out.println("The dolphin hung in the stream of water and slept for 4 hours");
    }
}
