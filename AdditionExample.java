import java.util.Scanner; // program uses class Scanner 
// Addition program that displays the sum of two numbers.
public class AdditionExample{
   // main method begins execution of Java application
    public static void main( String[] args){
	   Scanner input = new Scanner( System.in );
	   int number1; // first number to add
	   int number2; // second number to add
	   int sum; // sum of number1 and number2
 	   System.out.print( "Enter first integer: " ); // prompt
	   number1 = input.nextInt(); // read first number from user
	   System.out.print( "Enter second integer: " ); // prompt
	   number2 = input.nextInt(); // read second number from user
	   sum = number1 + number2; // add numbers
       System.out.println( "Sum is = "+ sum ); 
     } // end method main
 } // end class Addition

