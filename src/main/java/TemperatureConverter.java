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


    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(100));
        System.out.println("Celsius to Fahrenheit: " + celciusToFahrenheit(37));
        System.out.println("Kelvin to Celsius: " + kelvinToCelsius(300));
        System.out.println("Is -50 an extreme temperature? " + isExtremeTemp(-50));
        System.out.println("Is 20 an extreme temperature? " + isExtremeTemp(20));
        
    }

}

