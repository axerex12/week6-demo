import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {
    private TextField inputField = new TextField();
    private Label resultLabel = new Label();
    private ComboBox<String> conversionBox = new ComboBox<>();

    @Override
    public void start(Stage stage) {
        inputField.setPromptText("Enter value");

        // Conversion options
        conversionBox.getItems().addAll(
                "Celsius to Fahrenheit",
                "Fahrenheit to Celsius",
                "Kelvin to Celsius",
                "Celsius to Kelvin"
        );
        conversionBox.setValue("Celsius to Fahrenheit"); // default

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> convertTemperature());

        VBox root = new VBox(10, inputField, conversionBox, convertButton, resultLabel);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();
    }

    private void convertTemperature() {
        try {
            double value = Double.parseDouble(inputField.getText());
            String choice = conversionBox.getValue();
            double result = 0;

            switch (choice) {
                case "Celsius to Fahrenheit":
                    result = celsiusToFahrenheit(value);
                    resultLabel.setText(String.format("%.2f °F", result));
                    break;
                case "Fahrenheit to Celsius":
                    result = fahrenheitToCelsius(value);
                    resultLabel.setText(String.format("%.2f °C", result));
                    break;
                case "Kelvin to Celsius":
                    result = kelvinToCelsius(value);
                    resultLabel.setText(String.format("%.2f °C", result));
                    break;
                case "Celsius to Kelvin":
                    result = celsiusToKelvin(value);
                    resultLabel.setText(String.format("%.2f K", result));
                    break;
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number");
        }
    }

    // --- Conversion methods ---
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static Boolean isExtremeTemp(double temp) {
        return (temp < -40 || temp > 50);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
