package com.company;

public class Triangle {
    double a;
    double b;
    double c;

    void area() {
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p = (p - a) * (p - b) * (p - c)));
    }
}