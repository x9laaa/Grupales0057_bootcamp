package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

@Test
public void testAddition() {
Calculator calculator = new Calculator();
int result = calculator.add(2, 3);
Assertions.assertEquals(5, result, "La suma debe ser 5");
}

@Test
public void testSubtraction() {
Calculator calculator = new Calculator();
int result = calculator.subtract(5, 3);
Assertions.assertEquals(2, result, "La resta debe ser 2");
}

@Test
public void testMultiplication() {
Calculator calculator = new Calculator();
int result = calculator.multiply(4, 5);
Assertions.assertEquals(20, result, "La multiplicación debe ser 20");
}

@Test
public void testDivision() {
Calculator calculator = new Calculator();
double result = calculator.divide(10, 2);
Assertions.assertEquals(5.0, result, "La división debe ser 5.0");
}
}