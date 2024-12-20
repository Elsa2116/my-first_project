import java.util.Scanner;
    public class ExceptionHandling {
        public static int quotient(int numerator,int denominator ){
            return numerator / denominator;
        }// end method quotient
        public static void main( String args[] ){
            Scanner scanner =new Scanner( System.in ); // scanner for input
            System.out.print("Please enter an integer numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scanner.nextInt();
            int result = quotient( numerator, denominator );
            System.out.print( numerator + " / " + denominator + " = " + result );
        }
    }
      
