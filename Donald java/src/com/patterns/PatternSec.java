package com.patterns;

import java.util.Scanner;

public class PatternSec {
    public static void main(String[] args) {
        System.out.println("Enter the number: to print till that amt");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        pattern(a);

    }
    private static void pattern(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(col + " ");//Take a fuckin care of to print not to println
            }
            System.out.println();
        }

    }
}
