
    import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Variable to hold the reversed number
        int reversedNumber = 0;

        // Reverse the digits of the number
        while (number > 0) {
            // Get the last digit
            int lastDigit = number % 10;
            // Append it to the reversed number
            reversedNumber = reversedNumber * 10 + lastDigit;
            // Remove the last digit from the original number
            number /= 10;
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        // Close the scanner
        scanner.close();
    }
}


