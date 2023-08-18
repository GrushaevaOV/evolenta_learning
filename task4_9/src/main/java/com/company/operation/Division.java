package com.company.operation;

public class Division implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a / b;
    }
}
