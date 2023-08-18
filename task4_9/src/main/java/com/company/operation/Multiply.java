package com.company.operation;

public class Multiply implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}
