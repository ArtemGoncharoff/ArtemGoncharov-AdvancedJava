package org.example.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharacter {

    public static char findMostRepeatedCharacter(String s) {
        Map<Character, Integer> charsFrequency = new HashMap<>();
        int maxFrequency = 0;
        char mostOftenChar = 0;
        for (char c : s.toCharArray()) {
            int count = charsFrequency.getOrDefault(c, 0) + 1;
            charsFrequency.put(c, count);
            if (count > maxFrequency || (count == maxFrequency && s.indexOf(c) < s.indexOf(mostOftenChar))) {
                maxFrequency = count;
                mostOftenChar = c;
            }
        }
        return mostOftenChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:\n>>> ");
        String s = scanner.nextLine();
        System.out.println("The first most often character in this string is " + findMostRepeatedCharacter(s));
    }
}
