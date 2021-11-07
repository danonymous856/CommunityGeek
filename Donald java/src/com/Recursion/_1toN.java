package com.Recursion;

import java.util.Scanner;

public class _1toN {
    public static void main(String[] args) {
        _1toN(6);
    }
    static  void  _1toN(int n){
        if (n==0){
            return;
        }
        _1toN(n-1);
        System.out.println(n);


    }
}
