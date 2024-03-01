package org.example.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Artem", 25, 70000, new GregorianCalendar(2024, Calendar.FEBRUARY, 13));
        Employee employee2 = new Employee("Alexey", 40, 50000, new GregorianCalendar(2020, Calendar.JUNE, 20));
        Employee employee3 = new Employee("Petr", 32, 120000, new GregorianCalendar(2021, Calendar.MAY, 5));
        Employee employee4 = new Employee("Evgenia", 28, 80000, new GregorianCalendar(2022, Calendar.OCTOBER, 5));
        Employee employee5 = new Employee("Viktoria", 35, 110000, new GregorianCalendar(2023, Calendar.NOVEMBER, 19));
        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        };
        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Comparator<Employee> hireDateComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHireDate().compareTo(o2.getHireDate());
            }
        };
        System.out.println("Printing all workers to the console:");
        employees.forEach(System.out::println);
        System.out.println("________________________________________________________________");
        System.out.println("Printing employees with a salary greater than 100,000 to the console:");
        employees.stream().filter(employee -> employee.getSalary() > 100000).forEach(System.out::println);
        System.out.println("________________________________________________________________");
        System.out.println("Printing employee with the highest salary");
        System.out.println(employees.stream().max(salaryComparator).get());
        System.out.println("________________________________________________________________");
        System.out.println("Printing the sum of salaries of all employees");
        System.out.println(employees.stream().mapToInt(Employee::getSalary).sum());
        System.out.println("________________________________________________________________");
        System.out.println("Printing the average salary of employees");
        System.out.println((int)employees.stream().mapToInt(Employee::getSalary).average().getAsDouble());
        System.out.println("________________________________________________________________");
        System.out.println("Grouping employees by first letter of name");
        Map<String, List<Employee>> groups = employees.stream().collect(Collectors.groupingBy(employee -> employee.getName().substring(0, 1)));
        for (Map.Entry pair : groups.entrySet()) {
            System.out.println(pair.getKey());
            for (Employee e : (List<Employee>)pair.getValue()) {
                System.out.println(e);
            }
        }
    }
}
