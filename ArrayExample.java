
    import java.util.Scanner;

    public class ArrayExample {
        public static void main(String[] args) {
            float[] x = new float[5]; // Array declaration
            Scanner input = new Scanner(System.in); // Create a Scanner object for input
            float sum = 0; // Initialize sum variable
    
            System.out.println("Enter any five numbers:");
            for (int i = 0; i < 5; i++) {
                x[i] = input.nextFloat(); // Read each float number
                sum += x[i]; // Add to sum
            }
    
            System.out.println("Result = " + sum);  
            
            input.close(); // Close the scanner to avoid resource leaks
        }
    }
     

