package com.keyin.prpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PRpracticeTest {

    @Test
    public void testMultiply() {

        PRPractice calculatorUnderTest = new PRPractice();

        int resultOne = calculatorUnderTest.multiply(4,2);

        Assertions.assertNotEquals(10, resultOne);

        System.out.println("Result one does not equal " + resultOne);
    }

}
