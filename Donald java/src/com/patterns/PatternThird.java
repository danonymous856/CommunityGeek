package com.patterns;

import java.util.Scanner;

public class PatternThird {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        Pattern(n);
    }
    static  void Pattern(int d){
        for (int row = 0; row <= 2*d ; row++) {

            int totalcols=cols(row,d);
            int nospaces=d-totalcols;
            for (int col = 1 ; col <= nospaces  ; col++) {
                System.out.print(col+" "); //still remember the print thing and not println !!!!!
            }
            System.out.println();
        }
    }

    private static int cols(int row, int d) {
        if (row>d){
            return 2*d-row;
        }
        else
            return row;
    }

}
