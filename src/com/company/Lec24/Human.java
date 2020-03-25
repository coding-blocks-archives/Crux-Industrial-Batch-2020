package com.company.Lec24;

public class Human implements Comparable<Human> {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        return this.age-o.age;
    }
}
