public class StringOperations {
        public static void main(String[] args) {
          String text = "I Love Java and Java loves me.";
          System.out.println("text.indexOf(\"J\") = " + text.indexOf("J")); 
          System.out.println("text.indexOf(\"love\") = " + text.indexOf("love")); 
          System.out.println("text.indexOf(\"ove\") = " + text.indexOf("ove")); 
      
          // String concatenation
          String text1 = "Jon";
          String text2 = "Java";
          System.out.println("text1 + text2 = " + text1 + text2); 
          System.out.println("text1 + \" \" + text2 = " + text1 + " " + text2); 
          System.out.println("\"How are you, \" + text1 + \"?\" = " + "How are you, " + text1 + "?"); 
        }
      }  

