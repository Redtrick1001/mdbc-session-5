package temperatureconverter;

public class TemperatureConverter {
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 9 * 5;
    }

    public double toFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
