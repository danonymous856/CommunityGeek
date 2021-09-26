package com.Donald;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
     Met(1,5,78);
        Met("China","Donald","hange","Kakashi");
        Met(4,"Dollars");

    }

    private static void Met(int a,int b,int c) {
        int v=a+b-c;
        System.out.println(v);
    }
    private static void Met( String ...noun) {
        System.out.println(Arrays.toString(noun));
    }
    private static void Met(int a,String paisa) {
        String viv= a+" "+ paisa;
        System.out.println(viv);
    }

}
