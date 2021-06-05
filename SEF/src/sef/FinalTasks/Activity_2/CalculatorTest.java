package sef.FinalTasks.Activity_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals(
                "Sum of two numbers is not correct",
                15.2,
                calculator.add(5.0, 10.2),
                0);
    }

    @Test
    public void subtractTest() {
        assertEquals(
                "Subtraction of two numbers is not correct",
                -5.2,
                calculator.subtract(5.0, 10.2),
                0);
    }

    @Test
    public void multiplyTest() {
        assertEquals(
                "Multiplication of two numbers is not correct",
                17.28,
                calculator.multiply(5.4, 3.2),
                0);
    }

    @Test
    public void divideTest() {
        assertEquals(
                "Division of two numbers is not correct",
                5,
                calculator.divide(20, 4),
                0);
    }
}
