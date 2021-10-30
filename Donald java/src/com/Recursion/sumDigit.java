package com.Recursion;

public class sumDigit {
    public static void main(String[] args) {
        System.out.println(sum(5421));
    }

    private static int sum(int n) {
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
