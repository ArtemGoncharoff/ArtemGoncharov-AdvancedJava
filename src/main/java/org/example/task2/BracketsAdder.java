package org.example.task2;

import java.util.Scanner;

public class BracketsAdder {
    public static String addBrackets(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            builder.insert(builder.length() / 2, "(" + s.charAt(i) + s.charAt(s.length() - 1 - i) + ")");
        }
        if (s.length() % 2 != 0) {
            builder.insert(builder.length() / 2, "(" + s.charAt(s.length() / 2) + ")");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:\n>>> ");
        String s = scanner.nextLine();
        System.out.println(addBrackets(s));
    }
}
