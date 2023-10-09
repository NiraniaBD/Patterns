package org.example;

public class Person {
    private int age;
    private String name;
    private int zarplata;

    public Person(String name) {
        this.name = name;
    }


    public Person(int age, int zarplata) {
        this.age = age;
        this.zarplata = zarplata;
    }

    public Person() {
    }
}
