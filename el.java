import java.util.Scanner;

public class el {
    public static void main(String[] args) {
        // Initialize scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        for (int i= 0; i < t; i++) {
            // Read the value of n (size of the array)
            int n = sc.nextInt();
            
            // Array to store the result for this test case
            int[i] result = new int[n];
            
            // Generate the sequence for the current test case
            for (int i = 0; i < n; i++) {
                result[i] = 3 * (i + 1); // Generate 3 * (i+1)
            }
            
            // Print the result as space-separated integers
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        
        // Close the scanner
        sc.close();
    }
}
