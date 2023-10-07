package com.Leetcode;

public class DONALD {
    public static void main(String[] args){
        System.out.printf("Donald is a very good boy.\n");
        System.out.println(fibo(5));
    }

    // Fibonacci Series using Recursion
    static int fibo(int n)
    {
        if (n==0||n==1)
            return 0;
        else if(n==2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}