import java.util.Scanner;
public class SumOfEvenNum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value (greater than or equal to 2): ");
        int inputValue = scanner.nextInt();

        if (inputValue < 2) {
            System.out.println("Error: Input value must be greater than or equal to 2.");
        } else {
            int sum = 0;
            for (int i = 2; i <= inputValue; i += 2) {
                sum += i;
            }
            System.out.println("Sum of even numbers between 2 and " + inputValue + ": " + sum);
        }
    }
}



