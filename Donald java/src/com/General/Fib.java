package com.General;

public class Fib {
    public static void main(String[] args) {
        int a=fibbo(22);
        System.out.println(a);
    }
    static int fibbo(int n){
        if (n<2){
            return n;
        }
        return (fibbo(n-1)+fibbo(n-2));
    }
}
