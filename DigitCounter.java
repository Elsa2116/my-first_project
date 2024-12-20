
    import java.util.Scanner;

    public class DigitCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
    
            // Convert the number to a string to easily iterate through each digit
            String numberString = Integer.toString(Math.abs(number)); // Use absolute value to handle negative numbers
    
            // Variables to hold counts of odd, even, and zero digits
            int oddCount = 0;
            int evenCount = 0;
            int zeroCount = 0;
    
            // Iterate through each character in the string representation of the number
            for (char digitChar : numberString.toCharArray()) {
                int digit = Character.getNumericValue(digitChar); // Convert character to digit
    
                // Check if the digit is zero, even, or odd
                if (digit == 0) {
                    zeroCount++;
                } else if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
    
            // Display the counts
            System.out.println("Number of odd digits: " + oddCount);
            System.out.println("Number of even digits: " + evenCount);
            System.out.println("Number of zero digits: " + zeroCount);
    
            // Close the scanner
            scanner.close();
        }
    }
     

