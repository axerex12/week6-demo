public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celciusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static Boolean isExtremeTemp(double temp) {
        if (temp < -40) {
            return true;
        } else if (temp > 50) {
            return true;
        }
        return false;
    }
}