package org.example.task2;

import java.util.Scanner;

public class SpacesRemover {

    public static String removeSpaces(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ' && builder.charAt(i - 1) == ' ') {
                builder.deleteCharAt(i);
                i--;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:\n>>> ");
        String s = scanner.nextLine();
        System.out.println(removeSpaces(s));
    }
}
