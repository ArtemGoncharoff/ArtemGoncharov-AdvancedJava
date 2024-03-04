package org.example.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutation {

    public static boolean isPermuted(String s1, String s2) {
        Set<Character> stringCharacters1 = new HashSet<>();
        for (char ch : s1.toCharArray()) {
            stringCharacters1.add(ch);
        }
        Set<Character> stringCharacters2 = new HashSet<>();
        for (char ch : s2.toCharArray()) {
            stringCharacters2.add(ch);
        }
        if (stringCharacters1.equals(stringCharacters2)) {
            return !s1.equals(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string :\n>>> ");
        String s1 = scanner.next();
        System.out.print("Enter second string :\n>>> ");
        String s2 = scanner.next();

        if (isPermuted(s1, s2)) {
            System.out.println(s1 + " is a permutation of " + s2);
        }
        else {
            System.out.println(s1 + " is not a permutation of " + s2);
        }
    }
}
