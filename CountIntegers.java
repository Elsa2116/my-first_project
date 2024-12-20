
    import java.util.Scanner;

    public class CountIntegers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
    
            int count = 0;
            for (int i = num1; i <= num2; i++) {
                count++;
            }
    
            System.out.println("Number of integers between " + num1 + " and " + num2 + ": " + count);
        }
         

}
