
    import java.util.Scanner;
public class Elsa{
public static void main(String[] args){
Scanner console = new Scanner(System.in);
int a= console.nextInt();
int b = console.nextInt();
if (b < a){
int t = a;
a = b;
b = t;
}
System.out.println(a);
System.out.println(b);
}
}

public class Elsa{
    public static void main(String[] args){
        int a =10;
        int b =20;
        int c =25;
        int d =25;
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a * b = "+(a * b));
        System.out.println("b / a = "+(b / a));
        System.out.println("b % a = "+(b % a));
        System.out.println("c % a = "+(c % a));
        System.out.println("b ++= "+(b++));
        System.out.println("a-- = "+(a--));
        // Check the difference in d++ and ++d
        System.out.println("d++ = "+(d++));
        System.out.println("++b = "+(++b));
        }
        }   
