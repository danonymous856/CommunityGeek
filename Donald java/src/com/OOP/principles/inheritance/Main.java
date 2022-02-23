package com.OOP.principles.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        BoxAdd boxAdd = new BoxAdd(4,2.5f,5f);
        System.out.println(box.length+" "+box.height+" "+box.width);
        System.out.println(boxAdd.weight+" "+ boxAdd.density+" "+ boxAdd.vol);
    }
}
