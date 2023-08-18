package com.company;

import com.company.operation.Operation;

public class Calculator {

    Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }
    public void calc(double a, double b) {
        System.out.println(operation.getResult(a, b));
    }
}