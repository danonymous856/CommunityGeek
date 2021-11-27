//package com.Backtracking;
//
//import java.util.Scanner;
//
//public class N_knights {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Please enter the input:");
//        int n=in.nextInt();
//        boolean[][] board=new boolean[n][n];
////        knight(board);
//    }
//
//    static int knight(boolean[][] board, int r ,int c,int ) {  //r and c are rows and columns respectively
//        if (r == board.length){
//            display(board);
//            System.out.println();
//            return 1;
//        }
//        int count=0;
//        for (int c = 0; c < board.length ; c++) {
//            if (isSafe(board,r,c)){
//                board[r][c] = true;
//                count += knight(board, r+1);
//                board[r][c] = false;
//            }
//        }
//        return count;
//    }
//
//    static boolean isSafe(boolean[][] board, int r, int c) {
//        for (int i = 0; i < r ; i++) {
//            if (board[i][c]){
//                return false;
//            }
//        }
//        int maxLeft = Math.min(r, c);
//        for (int i = 0; i < maxLeft ; i++) {
//            if (board[r-i][c-i]){
//                return false ;
//            }
//        }
//        int maxRight = Math.min(r, board.length-c-1);
//        for (int i = 1; i < maxRight ; i++) {
//            if (board[r-i][c+i]){
//                return false;
//            }
//        }
//        return true ;
//
//    }
//    static void display(boolean[][] board) {
//        for (boolean[] row: board) {
//            for (boolean element : row){
//                if (element){
//                    System.out.print("K");
//                }
//                else {
//                    System.out.print("X");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}
