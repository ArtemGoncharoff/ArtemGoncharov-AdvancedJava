package org.example.task1.animals;

public class Tiger extends  Animal {
    @Override
    public void move() {
        System.out.println("The tiger ran 3 kilometers");
    }

    @Override
    public void eat() {
        System.out.println("The tiger caught and ate deer");
    }

    @Override
    public void sleep() {
        System.out.println("The tiger lay down in the bushes and slept for 12 hours");
    }
}
