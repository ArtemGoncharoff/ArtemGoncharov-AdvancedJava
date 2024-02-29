package org.example.task2;

import java.util.Scanner;

public class StringCompressor {
    public static String compressString(String s) {
        StringBuilder builder = new StringBuilder();
        int charCount = 1;
        char currentChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                charCount++;
            }
            else {
                builder.append(currentChar);
                builder.append(charCount);
                currentChar = s.charAt(i);
                charCount = 1;
            }
            if (i == s.length() - 1) {
                builder.append(currentChar);
                builder.append(charCount);
            }
        }
        return builder.length() < s.length() ? builder.toString() : s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string for compression:\n>>> ");
        String s = scanner.nextLine();
        System.out.println("String after compression - " + compressString(s));
    }
}
