package org.example.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DuplicateRemover {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(1);
        data.add(2);
        data.add(2);
        data.add(3);
        data.add(3);
        data.add(3);
        data.add(5);
        data.add(18);
        data.add(9);
        Collection<Integer> collection = removeDuplicates(data);
        System.out.println(collection.toString());
    }
}
