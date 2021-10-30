package com.Recursion;

public class ProductDigit {
    public static void main(String[] args) {
        System.out.println(prod(5421));
    }

    private static int prod(int n) {
        if (n==0){
            return 1;
        }
        return (n%10) * prod(n/10);
    }

}
