package org.example.SOLID.v3.domain;

public class Customer {
    private final String name;
    private final Grade grade;

    public Customer(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
    public String getName() {
        return name;
    }
}
