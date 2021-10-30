package com.patterns;

public class Patternfourth {
    public static void main(String[] args) {
        int n=5;
        patter(n);
    }

    private static void patter(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalcols=row>n?2*n-row:row;
            int noOfSpaces=n-totalcols;
            for (int col = 1; col <= noOfSpaces ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
