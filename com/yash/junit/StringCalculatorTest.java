package com.yash.junit;
/*
•Let us try to create different test cases below for String Calculator class
•An empty string returns zero
•A single number returns the value
•Two numbers, comma delimited, returns the sum
•Two numbers, new line delimited, returns the sum
•Three numbers, delimited either way, returns the sum
•Negative numbers throws an exception.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    void testEmptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void testSingleNumberReturnsValue() {
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void testTwoNumbersCommaDelimitedReturnsSum() {
        assertEquals(10, calculator.add("3,7"));
    }

    @Test
    void testTwoNumbersNewLineDelimitedReturnsSum() {
        assertEquals(10, calculator.add("2\n8"));
    }

    @Test
    void testThreeNumbersDelimitedEitherWayReturnsSum() {
        assertEquals(6, calculator.add("1,2\n3"));
    }

    @Test
    void testNegativeNumbersThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                    calculator.add("5,-3");
                }
        );
        assertEquals("Negative numbers not allowed: -3", exception.getMessage());
    }
}