package org.example.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Students {

    private String name;
    private int age;
    private Sex sex;

    public enum Sex {
        MAN,
        WOMEN
    }
}

