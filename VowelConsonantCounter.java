
    import java.util.Scanner;

    public class VowelConsonantCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            // Variables to hold counts of vowels and consonants
            int vowelCount = 0;
            int consonantCount = 0;
    
            // Convert the input string to lowercase to simplify comparisons
            String lowerCaseInput = input.toLowerCase();
    
            // Iterate through each character in the string
            for (int i = 0; i < lowerCaseInput.length(); i++) {
                char ch = lowerCaseInput.charAt(i);
                
                // Check if the character is a letter
                if (Character.isLetter(ch)) {
                    // Check if the character is a vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        // If it's not a vowel, it's a consonant
                        consonantCount++;
                    }
                }
            }
    
            // Display the counts
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            
            // Close the scanner
            scanner.close();
        }
    }
       

