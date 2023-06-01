//Convert input temperature from Celsius to Fahrenheit(F=T*1.8+32)

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
