package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void checkReturnsFizzIfDivisibleByThree() {
        FizzBuzz runner = new FizzBuzz();
        String results = runner.isFizzBuzz(3);
        assertEquals("Fizz", results);
    }
    @Test
    void checkReturnsBuzzIfDivisibleByFive() {
        FizzBuzz runner = new FizzBuzz();
        String results = runner.isFizzBuzz(5);
        assertEquals("Buzz", results);
    }
    @Test
    void checkReturnsFizzBuzzIfDivisibleByBoth() {
        FizzBuzz runner = new FizzBuzz();
        String results = runner.isFizzBuzz(15);
        assertEquals("FizzBuzz", results);
    }
    @Test
    void checkReturnsNumberIfNotDivisibleByBoth() {
        FizzBuzz runner = new FizzBuzz();
        String results = runner.isFizzBuzz(1);
        assertEquals("1", results);
    }
}