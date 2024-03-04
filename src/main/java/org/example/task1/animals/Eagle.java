package org.example.task1.animals;

public class Eagle extends  Animal {

    @Override
    public void move() {
        System.out.println("The eagle flew 20 km");
    }

    @Override
    public void eat() {
        System.out.println("The eagle caught and ate the mouse");
    }

    @Override
    public void sleep() {
        System.out.println("The eagle landed in the nest and slept for 40 minutes");
    }
}
