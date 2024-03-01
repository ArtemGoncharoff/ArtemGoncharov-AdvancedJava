package org.example.task2;

import java.util.LinkedList;
import java.util.Scanner;

public class BracketsValidator {

    public static boolean validateBrackets(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                list.addLast(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (list.isEmpty()) {
                    return false;
                }
                char openBracket = list.removeLast();
                if ((c == ')' && openBracket != '(') ||
                        (c == ']' && openBracket != '[') ||
                        (c == '}' && openBracket != '{')) {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string consisting of brackets:\n>>> ");
        String s = scanner.nextLine();
        System.out.println("testString1 was " + (validateBrackets(s) ? "validated" : "not validated"));
    }
}
