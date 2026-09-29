package romannumeralscalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralCalculatorTest {

    @Test
    void whenOneIsEnterIIsReturn() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("I", runner.calc(1));
    }

    @Test
    void whenThreeIsEnterIIIIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("III", runner.calc(3));
    }

    @Test
    void whenFourIsEnterIVIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("IV", runner.calc(4));
    }

    @Test
    void whenFiveIsEnterVIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("V", runner.calc(5));
    }

    @Test
    void whenEightIsEnterVIIIIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("VIII", runner.calc(8));
    }

    @Test
    void whenNineIsEnterIXIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("IX", runner.calc(9));
    }

    @Test
    void whenTenIsEnterXIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("X", runner.calc(10));
    }

    @Test
    void whenThirtyEightIsEnterXXXVIIIIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("XXXVIII", runner.calc(38));
    }

    @Test
    void whenFortyIsEnterXLsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("XL", runner.calc(40));
    }

    @Test
    void whenFortyNineIsEnterXLXIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("XLIX", runner.calc(49));
    }

    @Test
    void whenFiftyEnterLIsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("L", runner.calc(50));
    }

    @Test
    void whenNintyEnterXCsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("XC", runner.calc(90));
    }

    @Test
    void whenOneHundredEnterCsReturned() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();
        assertEquals("C", runner.calc(100));
    }

    @Test
    void returnsCorrectStringWhenNumberIsEntered() {
        RomanNumeralCalculator runner = new RomanNumeralCalculator();

        assertEquals("XXVIII", runner.calc(28));
        assertEquals("XXXIII", runner.calc(33));
        assertEquals("XLIII", runner.calc(43));
        assertEquals("XCIX", runner.calc(99));
        assertEquals("CCXLIX", runner.calc(249));

    }
}