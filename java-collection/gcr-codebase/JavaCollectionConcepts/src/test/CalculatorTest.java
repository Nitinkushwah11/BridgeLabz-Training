package test;

import com.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.junit.Calculator;

public class CalculatorTest {
    private final com.junit.Calculator calculator = new com.junit.Calculator();

    @Test
    public void testAdd() {
	assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
	assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
	assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
	assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
	assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}
