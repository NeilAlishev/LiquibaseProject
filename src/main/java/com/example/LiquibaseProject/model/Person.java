package com.example.LiquibaseProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author Neil Alishev
 */

@Data
@NoArgsConstructor
public class Person {

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}