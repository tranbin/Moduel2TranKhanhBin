package ss8_clean_code.thuc_hanh.refactoring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int numberA = 1;
        int numberB = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(numberA, numberB, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int numberA = 2;
        int numberB = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(numberA, numberB, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int numberA = 2;
        int numberB = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.calculate(numberA, numberB, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int numberA = 6;
        int numberB = 3;
        char opertator = '/';
        int expected = 2;

        int result = Calculator.calculate(numberA, numberB, opertator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int numberA = 2;
        int numberB = 0;
        char opertator = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(numberA, numberB, opertator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int numberA = 2;
        int numberB = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(numberA, numberB, operator);});
    }

}
