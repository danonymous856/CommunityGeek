package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=new String[5];

        System.out.println("Please enter the strings:");
        for (int i = 0; i < str.length ; i++) {
            str[i]=input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
