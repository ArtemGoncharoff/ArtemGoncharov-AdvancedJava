package org.example.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairNumberCalculator {

    public static int calculatePairNumber(Integer[] integers) {
        Map<Integer, Integer> identicalIntegers = new HashMap<>();
        for (int i : integers) {
            int count = identicalIntegers.getOrDefault(i, 0) + 1;
            identicalIntegers.put(i, count);
        }
        int pairNumber = 0;
        for (Integer i : identicalIntegers.values()) {
            pairNumber += i * (i - 1) / 2;
        }
        return pairNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers and then type <<stop>> to stop input:\n>>> ");
        String s = scanner.next();
        while (!s.equalsIgnoreCase("stop")) {
            System.out.print(">>> ");
            try {
                data.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("You entered invalid value, try again");
            }
            s = scanner.next();
        }
        System.out.println("The number of pairs in the number series you entered: "+calculatePairNumber(data.toArray(new Integer[0])));
    }
}
