package com.Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println((subseqList("", "abc")));

    }

    static void subseq(String a, String b) {
        if (b.isEmpty()) {
            System.out.println(a);
            return;
        }

        char ch = b.charAt(0);

        subseq(a + ch, b.substring(1));
        subseq(a, b.substring(1));
    }

    static ArrayList<String> subseqList(String p, String q) {
        if (q.isEmpty()) {
            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }

        char ch = q.charAt(0);

        ArrayList<String> left = subseqList(p + ch, q.substring(1));
        ArrayList<String> right = subseqList(p, q.substring(1));

        left.addAll(right);
        return left;
    }
}