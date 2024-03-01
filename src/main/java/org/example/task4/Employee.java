package org.example.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.GregorianCalendar;

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