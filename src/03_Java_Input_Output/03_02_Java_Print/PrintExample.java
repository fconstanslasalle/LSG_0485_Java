import java.util.Date;

public class PrintExample {
    public static void main(String[] args) {
        // 1. System.out.println() - Prints text and moves to a new line
        System.out.println("--- System.out.println() ---");
        System.out.println("Hello, World!");
        System.out.println("This prints on a new line.");
        System.out.println(123); // Can print numbers too

        // 2. System.out.print() - Prints text but stays on the same line
        System.out.println("\n--- System.out.print() ---");
        System.out.print("This is ");
        System.out.print("on the same ");
        System.out.print("line.");
        System.out.println(); // Manually add a new line at the end

        // 3. System.out.printf() - Formatted output
        System.out.println("\n--- System.out.printf() ---");
        String item = "Coffee";
        double price = 2.50;
        int quantity = 3;

        // %s = String, %.2f = float/double with 2 decimal places, %d = integer
        System.out.printf("Item: %s, Price: %.2f, Quantity: %d%n", item, price, quantity);

        // %n is a platform-independent newline character
        System.out.printf("Total Cost: %.2f%n", price * quantity);

        // Formatting dates (requires java.util.Date)
        Date now = new Date();
        System.out.printf("Current Date/Time: %tc%n", now);
    }
}
