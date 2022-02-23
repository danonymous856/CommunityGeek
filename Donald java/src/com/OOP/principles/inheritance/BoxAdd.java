package com.OOP.principles.inheritance;

public class BoxAdd extends Box {
    double weight;
    float density;
    float vol;

     BoxAdd(int length, double width, float height, double weight, float density, float vol) {
        super(length, width, height);
        this.weight = weight;
        this.density = density;
        this.vol = vol;
    }

     BoxAdd(int weight, float density, float vol) {
        this.weight = weight;
        this.density = density;
        this.vol = vol;
    }

     BoxAdd(double side, double weight, float density, float vol) {
        super(side);
        this.weight = weight;
        this.density = density;
        this.vol = vol;
    }

     BoxAdd(Box old, double weight, float density, float vol) {
        super(old);
        this.weight = weight;
        this.density = density;
        this.vol = vol;
    }

    public void info(){
        System.out.println("tryin the EXTENDS keyword");
    }
}
