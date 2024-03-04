package org.example.task1.animals;

import lombok.Data;

@Data
public class Animal {
    private int numberOfLimbs = 4;
    private boolean isWarmBlooded = true;

    public void move() {
        System.out.println("The animal moved");
    }

    public  void  eat() {
        System.out.println("The animal ate something");
    }

    public void sleep() {
        System.out.println("The animal slept for some time");
    }
}
