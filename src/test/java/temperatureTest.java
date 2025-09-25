import junit.framework.TestCase;
import org.junit.Test;
public class temperatureTest extends TestCase {

    @Test
    public void testIsExtremeTemp() {
        assertTrue(temperatureconverter.isExtremeTemp(-50));
        assertTrue(temperatureconverter.isExtremeTemp(60));
        assertFalse(temperatureconverter.isExtremeTemp(20));
        assertFalse(temperatureconverter.isExtremeTemp(-10));
    }

    
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, temperatureconverter.celciusToFahrenheit(100));
        assertEquals(-40.0, temperatureconverter.celciusToFahrenheit(-40));
        assertEquals(32.0, temperatureconverter.celciusToFahrenheit(0));
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(100.0, temperatureconverter.fahrenheitToCelsius(212));
        assertEquals(-40.0, temperatureconverter.fahrenheitToCelsius(-40));
        assertEquals(0.0, temperatureconverter.fahrenheitToCelsius(32));
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0, temperatureconverter.kelvinToCelsius(273.15), 0.01);
        assertEquals(100, temperatureconverter.kelvinToCelsius(373.15), 0.01);
        assertEquals(-273.15, temperatureconverter.kelvinToCelsius(0), 0.01);
    }
}

