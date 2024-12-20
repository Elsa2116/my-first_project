
    import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the entire line

        // Iterate through each character in the string
        for (char character : inputString.toCharArray()) {
            System.out.println(character); // Print each character on a new line
        }

        // Close the scanner
        scanner.close();
    }
}


