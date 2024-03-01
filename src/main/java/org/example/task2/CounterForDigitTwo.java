package org.example.task2;

import java.util.Scanner;

public class CounterForDigitTwo {

    public static int countTwos(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (char number : String.valueOf(i).toCharArray())
                if (number == '2') count++;
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
        System.out.printf("The quantity of digits two in the numbers from 0 to %d is %d", number, countTwos(number));
    }
}
