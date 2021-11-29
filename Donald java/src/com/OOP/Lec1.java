package com.OOP;

import java.util.Arrays;

public class Lec1 {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student donald;
        System.out.println(Arrays.toString(students));
    }

}
class Student{
    static int[] roll_no= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];
}
