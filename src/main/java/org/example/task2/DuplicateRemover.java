package org.example.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements(numbers or letters) and then type <<stop>> to stop input:\n>>> ");
        String s = scanner.nextLine();
        while (!s.equalsIgnoreCase("stop")) {
            System.out.print(">>> ");
            data.add(s);
            s = scanner.nextLine();
        }
        Collection<String> collection = removeDuplicates(data);
        System.out.println("Collection after removing duplicates:\n"+collection.toString());
    }
}
