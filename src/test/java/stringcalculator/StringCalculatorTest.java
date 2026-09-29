package stringcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator runner;

    @BeforeEach
    void setup() {
        this.runner = new StringCalculator();
    }

    @Test
    void shouldReturnEmptyStringIfOneIsEntered() {
        assertEquals("", runner.calc(""));
    }

    @Test
    void shouldReturnTheNumberIfThereAreNoSpacesInTheString() {
        assertEquals("999", runner.calc("999"));
    }

    @Test
    void shouldNotIncludeNumberThatContainLettersThanOneThousand() {
        assertEquals("", runner.calc("999A9"));
    }

    @Test
    void shouldNotIncludeNumberLargerThanOneThousand() {
        assertEquals("", runner.calc("9999"));
    }

    @Test
    void shouldSumAllNumberSeparatedBySpaces() {
        assertEquals("25", runner.calc("15 10"));
        assertEquals("23", runner.calc("5 7 11"));
        assertEquals("3", runner.calc("1 1 1"));
    }

    @Test
    void shouldOnlyAllowThreeNumberToBeSummedTogether() {
        assertEquals("3", runner.calc("1 1 1 1"));
    }


}