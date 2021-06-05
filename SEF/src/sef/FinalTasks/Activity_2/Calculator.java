package sef.FinalTasks.Activity_2;

import java.text.DecimalFormat;

public class Calculator {

    DecimalFormat df = new DecimalFormat("###.###");

    public double add(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber + secondNumber));
    }

    public double subtract(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber - secondNumber));
    }

    public double multiply(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber * secondNumber));
    }

    public double divide(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber / secondNumber));
    }
}