import java.util.Scanner;

public class ArithmeticProgression {

    // Method to compute the Nth term of the arithmetic progression
    public static int findNthTerm(int n, int a, int d) {
        // Calculate the Nth term using the formula
        return a + (n - 1) * d;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the value of n (position of the term)
        System.out.print("Enter the position of the term (n): ");
        int n = scanner.nextInt();
        
        // Read the value of a (first term)
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        
        // Read the value of d (common difference)
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        
        // Compute the Nth term of the arithmetic progression
        int nthTerm = findNthTerm(n, a, d);
        
        // Print the Nth term
        System.out.println(nthTerm);
        
        // Close the Scanner
        scanner.close();
    }
}
