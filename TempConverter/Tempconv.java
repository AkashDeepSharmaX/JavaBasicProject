
import java.util.*;

public class Tempconv {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public double

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Tempconv tempconv = new Tempconv();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!\n 1. Celsius to Fahrenheit\n 2. Celsius to Kelvin\n 3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin/5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\nChoose an option (1-6):");
        int userInput = sc.nextInt();
        System.out.println("enter the value of temperatre : ");
        double temperatre = sc.nextDouble();
        double contemp = 0;
        switch(userInput){
    case 1:
              contemp= tempconv.celsiusToFahrenheit(temperatre);
               System.out.println("Result: %.2f Celsius = %.2f Fahrenheit%n"+temperatre);
               break;
               case 2:
               contemp = tempconv.celsiusToKelvin(temperatre);
               System.out.printf("Result: %.2f Celsius = %.2f Kelvin%n" +temperatre +contemp);
               break;
           case 3:
               contemp = tempconv.fahrenheitToCelsius(temperatre);
               System.out.printf("Result: %.2f Fahrenheit = %.2f Celsius%n" +temperatre +contemp);
               break;
               default:   
               System.out.println("Invalid choice. Please run the program again.");
               break;

        }

    }
}
