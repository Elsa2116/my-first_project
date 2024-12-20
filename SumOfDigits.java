
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            sum += number % 10;  // Add the last digit to the sum
            number /= 10;      // Remove the last digit from the number
        }

        System.out.println("Sum of digits: " + sum);
    }
}

