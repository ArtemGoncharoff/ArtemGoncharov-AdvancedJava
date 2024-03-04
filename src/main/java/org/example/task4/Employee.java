package org.example.task4;

import java.util.GregorianCalendar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int age;
    private int salary;
    private GregorianCalendar hireDate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hireDate=" + hireDate.getTime() +
                '}';
    }
}
