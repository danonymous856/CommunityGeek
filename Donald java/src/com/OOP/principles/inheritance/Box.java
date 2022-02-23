package com.OOP.principles.inheritance;

public class Box {
    int length;
    double width;
    float height;

     Box(int length, double width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box(){
         this.length=-1;
         this.width=-1;
         this.height=-1;
    }
    Box(double side) {
        this.length = (int)side;
        this.width = side;
        this.height = (float) side;
    }
    Box(Box old){
         this.height = old.height;
         this.width = old.width;
         this.length = old.length;
    }
    public void DisplayInfo(){
        System.out.println("running the Box");
    }
}
