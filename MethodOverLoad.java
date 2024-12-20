public class MethodOverLoad{
    // test overloaded square methods
    public void testOverloadedMethods(){
    System.out.printf( "Square of integer 7 is " +square( 7 ) );
    System.out.printf( "Square of double 7.5 is" + square( 7.5 ) );
    }
    public int square( int intValue ){
    System.out.printf("Called square with int argument:" +intValue );
    return intValue * intValue;
    }
    public double square( double doubleValue ){
    System.out.printf("\nCalled square with double argument:"
    +doubleValue );
    return doubleValue * doubleValue;

    }
}
public class MethodOverloadTest{
    public static void main( String args[] ){
    MethodOverload methodOverload = new MethodOverload();
    methodOverload.testOverloadedMethods();
    }
}