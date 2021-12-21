package com.OOP.staticQuery;

public class Main {
    public static void main(String[] args) {
        Human Donald = new Human(22,"Donald ","Laishram",true,15000);
        Human Rohit = new Human(32,"viowjsdnvisd","nvvios",false,45000);
        Human Abhishek = new Human(32,"viowjsdnvisd","nvvios",false,86000);
        Human Kinjal = new Human(32,"viowjsdnvisd","nvvios",false,470026);

        System.out.println(Human.integer);
        System.out.println(Rohit.virgin);
        System.out.println(Human.integer);
        System.out.println(Kinjal.salary);
    }
}
