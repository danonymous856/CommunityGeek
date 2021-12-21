package com.OOP.staticQuery;

public class Human {
    int age;
    String name;
    String surname;
    boolean virgin;
    long salary;
    static int integer; //Here static is used for boolean value

    public Human(int age, String name, String surname, boolean virgin, long salary) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.virgin = virgin;
        this.salary = salary;
        Human.integer ++;
    }
}
