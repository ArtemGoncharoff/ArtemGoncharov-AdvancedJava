package org.example.task2;

import java.util.Scanner;

public class CounterForDigitTwo {

    public static int count(long number) {
        int count = 0;
        String stringNumber = String.valueOf(number);
        for (char digit : stringNumber.toCharArray()) {
            if (digit == '2') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Enter number :\n>>> ");
            number = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("You entered invalid value, please try again");
        }
        System.out.printf("The quantity of digits two in the number %d is %d", number, count(number));
    }
}
