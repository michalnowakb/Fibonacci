package com.sparta.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private double numberOne = 0;
    private double numberTwo = 1;

    private List<Double> fibonnaciNumbers = new ArrayList<>();
    private final double scope;

    public Fibonacci(double scope) {
        this.scope = scope;
    }

    public void fibonacciCounter() {
        for (double number = 0; number <= scope; number++) {
            double fibonacci = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = fibonacci;
            fibonnaciNumbers.add(fibonacci);
        }
    }

    public void fibonacciNumbersPrinter() {
        System.out.println(fibonnaciNumbers);
        System.out.println();
    }
}
