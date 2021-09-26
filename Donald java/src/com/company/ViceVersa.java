package com.company;

public class ViceVersa {
    public static void main(String[] args) {
        int n=46545;

        int count=0;

        while(n>0){
            int rem=n%10;
            n=n/10;

            count=count*10+rem;

        }
        System.out.println(count);
    }
}
