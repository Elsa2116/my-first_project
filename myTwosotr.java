import java.util.Scanner;

public class myTwosotr {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = console.nextInt();

        System.out.print("Enter the second integer: ");
        int b = console.nextInt();

        // Sort the numbers in ascending order
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("The numbers in ascending order are: " + a + " " + b);
    }
}

