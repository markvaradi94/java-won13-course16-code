package ro.fasttrackit.course16.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TemperatureConverterTest {

    @Test
    void celsiusTest() {
        //GIVEN

        //WHEN
        double result = TemperatureConverter.celsiusToFahrenheit(10.0);

        //THEN
        assertThat(result).isPositive()
                .isEqualTo(50.0);
    }

    @Test
    void callFahrenheitToCelsius() {
        TemperatureConverter.fahrenheitToCelsius(10.0);
    }

    @Test
    void returnCelsiusTest() {
        double result = TemperatureConverter.fahrenheitToCelsius(10.0);
    }

    @Test
    void convertFahrenheitToCelsiusTest() {
        double result = TemperatureConverter.fahrenheitToCelsius(50.0);
        assertThat(result).isEqualTo(10.0);
    }
}