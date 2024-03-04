package org.example.task2;

public class ArrayIterator {

    public static <E> void iterate(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 99, 528, 11};
        iterate(integers);
    }
}
