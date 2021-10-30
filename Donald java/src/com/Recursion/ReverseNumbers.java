package com.Recursion;

public class ReverseNumbers {
    public static void main(String[] args) {

        System.out.println(revNum(534156));
    }

    private static int revNum(int n) {

        if (n==0){
            return n;
        }

        return (int) ((n%10)*Math.pow(10,countDigit(n)-1) + revNum(n/10));
    }

    static  int countDigit(int n) {
        if (n/10 == 0)
            return 1;
        return  1 + countDigit(n / 10);
    }
}
