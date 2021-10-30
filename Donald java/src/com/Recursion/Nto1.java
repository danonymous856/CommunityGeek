package com.Recursion;

public class Nto1 {
    public static void main(String[] args) {
       nto1(5);
    }

    private static void nto1(int i) {
        if (i==0){
            return;
        }
        System.out.println(i);
        nto1(i-1);
//        System.out.println(i);
    }
}
