package com.patterns;

import java.util.Scanner;

public class PatternFirst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        pattern(5);

    }

    private static void pattern(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");//Take a fuckin care of to print not to println
            }
        System.out.println();
        }

    }
}
