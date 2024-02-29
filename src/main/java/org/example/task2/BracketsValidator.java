package org.example.task2;

import java.util.LinkedList;

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
        String testString1 = "{[()]}";
        String testString2 = "{[(])}";
        String testString3 = "{{{{}}}}";
        System.out.println(validateBrackets(testString1));
        System.out.println(validateBrackets(testString2));
        System.out.println(validateBrackets(testString3));
    }
}
