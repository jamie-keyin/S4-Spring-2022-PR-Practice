package com.keyin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculatorUnderTest = new Calculator();

    @Test
    @DisplayName("Test Addition successful ")
    public void testAdd() {
        Assertions.assertEquals(2, calculatorUnderTest.add(-1, 3));
        Assertions.assertNotEquals(0, calculatorUnderTest.add(5, 2));
        Assertions.assertNotEquals(10, calculatorUnderTest.add(15, 25));
    }
}