package com.company;

import com.company.operation.Adder;
import com.company.operation.Division;
import com.company.operation.Multiply;
import com.company.operation.Subtractor;

public class Main {

    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;

        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);

        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);

        calculator = new Calculator(new Multiply());
        calculator.calc(a, b);

        calculator = new Calculator(new Division());
        calculator.calc(a, b);

    }
}