package com.Anita;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        System.out.println("please enter the terminating number at which we need to find the sum of even numbers:");
        int result=Sum_even(in.nextInt(), 0);
        System.out.println(result);

        System.out.println("\t");

        System.out.println("please enter the terminating number at which we need to find the sum of odd numbers:");
        int ans=Sum_odd(in.nextInt(), 0);
        System.out.println(ans);

    }

    private static int Sum_odd(int n, int sum) {
        for (int i = 0; i < n; i++) {
            if (i%2!=0){
               sum+=i;
            }
        }
//        System.out.println("sum="+sum);
        return sum;
    }

    private static int Sum_even(int n, int sum) {
        for (int i = 1; i <n ; i++) {
            if((i%2)==0){
                sum+=i;
            }
        }
//        System.out.println("sum="+sum);
        return sum;
    }


}
