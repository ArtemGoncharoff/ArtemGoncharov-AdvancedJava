package org.example.task3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Students> students = List.of( new Students("Vasiliy", 16, Students.Sex.MAN), new Students("Petr", 23, Students.Sex.MAN),
                new Students("Elena", 42, Students.Sex.WOMEN), new Students("Ivan", 69, Students.Sex.MAN), new Students("Alexey", 38, Students.Sex.MAN),
                new Students("Artem", 25, Students.Sex.MAN), new Students("Ekaterina", 30, Students.Sex.WOMEN));

        System.out.println("People who will receive the summons (ages 18 to 27):");
        students.stream().filter(student -> student.getAge() > 17 && student.getAge() < 28 && student.getSex() == Students.Sex.MAN).forEach(System.out::println);
        System.out.println("________________________________________________________________");
        System.out.println("All potential workers:");
        students.stream().filter(student -> (student.getSex() == Students.Sex.MAN && student.getAge() > 17 && student.getAge() < 60) || (student.getSex() == Students.Sex.WOMEN && student.getAge() > 17 && student.getAge() < 55)).forEach(System.out::println);
        System.out.println("________________________________________________________________");
        List<String> strings = List.of("a1", "a4", "a3", "a2", "a1", "a4");
        System.out.println("Sorted strings:");
        strings.stream().sorted().forEach(System.out::println);
        System.out.println("________________________________________________________________");
        System.out.println("Strings ending with _1");
        strings.stream().map(s -> s+"_1").forEach(System.out::println);
        System.out.println("________________________________________________________________");
        System.out.println("Array of integers");
        System.out.println(Arrays.toString(strings.stream().mapToInt(s -> Integer.parseInt(s.substring(1))).toArray()));
        System.out.println("________________________________________________________________");
        System.out.println("Sorted distinct strings");
        strings.stream().sorted().distinct().forEach(System.out::println);
    }
}
