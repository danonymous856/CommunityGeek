package com.OOP.India;

public class NestingClass {
    class innerClass{
        int AGE;
        int SALARY;
        String name;
        boolean human;

        public innerClass(int AGE, int SALARY, String name, boolean human) {
            this.AGE = AGE;
            this.SALARY = SALARY;
            this.name = name;
            this.human = human;
        }
    }
}
