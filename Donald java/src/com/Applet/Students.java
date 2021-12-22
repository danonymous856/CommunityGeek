package com.Applet;

public class Students {
    int roll=20;
    String sname="Donald";

    void display() {
        System.out.println("Student roll number is "+roll);
        System.out.println("Student name is "+sname);
    }

    public static void main(String[] args) {
        Students sc=new Students();
        sc.display();
    }

}