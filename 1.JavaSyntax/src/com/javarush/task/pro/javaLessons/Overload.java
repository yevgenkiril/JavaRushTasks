package com.javarush.task.pro.javaLessons;

import java.io.IOException;

public class Overload {
    public static int addTwoDigits (int a, int b) throws IOException {
        return a + b;
    }
    protected final double addTwoDigits (double a, double b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception{
        OverloadChild overload = new OverloadChild();
        System.out.println(overload.addTwoDigits(4, 6));
        System.out.println(overload.addTwoDigits(3.2, 4.7));
        overload.addTwoDigits(5);
    }
}
class OverloadChild extends Overload {
    void addTwoDigits (int i){
        System.out.println("overload method");
    }
}