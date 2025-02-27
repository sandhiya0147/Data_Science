import java.util.Scanner;

public class c {

    // Method to calculate the number of days until Saturday
    public static int daysUntilSaturday(char day) {
        // Define the day values for Monday to Friday
        int dayValue = switch (day) {
            case 'M' -> 0;  // Monday
            case 'T' -> 1;  // Tuesday
            case 'W' -> 2;  // Wednesday
            case 'R' -> 3;  // Thursday
            case 'F' -> 4;  // Friday
            default -> throw new IllegalArgumentException("Invalid day input"); // For invalid inputs
        };

        // Calculate days until Saturday, including Saturday itself
        return (6 - dayValue + 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the day of the week from the user
        System.out.print("Enter the day of the week (M, T, W, R, F): ");
        char day = scanner.next().charAt(0);
        
        // Validate input
        if (day != 'M' && day != 'T' && day != 'W' && day != 'R' && day != 'F') {
            System.out.println("Invalid day input. Please enter M, T, W, R, or F.");
            return;
        }
        
        // Calculate the number of days until Saturday
        int daysUntilSaturday = daysUntilSaturday(day);
        
        // Print the result
        System.out.println("Days until Saturday: " + daysUntilSaturday);
        
        // Close the Scanner
        scanner.close();
    }
}
