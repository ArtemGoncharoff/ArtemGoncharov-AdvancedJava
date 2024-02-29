package org.example.task2;

import java.util.HashMap;
import java.util.Map;

public class PairNumberCalculator {

    public static int calculatePairNumber(int[] integers) {
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
        int[] nums = {4, 1, 2, 4, 4, 2, 6, 7, 8, 9, 7, 5, 6};
        System.out.println(calculatePairNumber(nums));
    }
}
