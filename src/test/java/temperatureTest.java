import junit.framework.TestCase;
import org.junit.Test;
public class temperatureTest extends TestCase {

    @Test
    public void testIsExtremeTemp() {
        assertTrue(TemperatureConverter.isExtremeTemp(-50));
        assertTrue(TemperatureConverter.isExtremeTemp(60));
        assertFalse(TemperatureConverter.isExtremeTemp(20));
        assertFalse(TemperatureConverter.isExtremeTemp(-10));
    }

    
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, TemperatureConverter.celciusToFahrenheit(100));
        assertEquals(-40.0, TemperatureConverter.celciusToFahrenheit(-40));
        assertEquals(32.0, TemperatureConverter.celciusToFahrenheit(0));
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212));
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40));
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32));
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0, TemperatureConverter.kelvinToCelsius(273.15), 0.01);
        assertEquals(100, TemperatureConverter.kelvinToCelsius(373.15), 0.01);
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.01);
    }
}

