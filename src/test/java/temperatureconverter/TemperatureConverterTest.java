package temperatureconverter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    // converting to Celsius
    @Test
    @Tag("Celsius")
    @DisplayName("Testing to see if it return 0 when 32 is entered")
    void doseReturnZeroWhenThirtyTwoIsEntered() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.toCelsius(32));
    }

    @Test
    @Tag("Celsius")
    @DisplayName("Testing to see if it return the correct value")
    void doesReturnCorrectValueWhenConvertingToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(5, converter.toCelsius(41));
        assertEquals(10, converter.toCelsius(50));
        assertEquals(-5, converter.toCelsius(23));
        assertEquals(-6, converter.toCelsius(21.2), 0.0001);
    }

    // converting to Fahrenheit
    @Test
    @Tag("Fahrenheit")
    @DisplayName("Testing to see if it return 32 when 0 is entered")
    void doseReturnThirtyTwoWhenZeroIsEntered() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32, converter.toFahrenheit(0));
    }

    @Test
    @Tag("Fahrenheit")
    @DisplayName("Testing to see if it return the correct value")
    void doesReturnCorrectValueWhenConvertingToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(41, converter.toFahrenheit(5));
        assertEquals(50, converter.toFahrenheit(10));
        assertEquals(23, converter.toFahrenheit(-5));
        assertEquals(21.2, converter.toFahrenheit(-6), 0.0001);
    }
}