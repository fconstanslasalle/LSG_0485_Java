package Java_Input_Output.Java_Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user for a double
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Display the input data
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
    }
}
