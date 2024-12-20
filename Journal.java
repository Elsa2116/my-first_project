
import java.util.Scanner;

public class Journal {
    // Instance variables to store the details of the journal entry
    private String authorName;
    private String title;
    private String submissionDate;

    // Constructor to initialize the instance variables
    public Journal(String authorName, String title, String submissionDate) {
        this.authorName = authorName;
        this.title = title;
        this.submissionDate = submissionDate;
    }

    // Method to display the journal details
    public void displayDetails() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Submission Date: " + submissionDate);
    }

    // Method to return the title with each word capitalized
    public String getSubmissionDetails() {
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();

        for (String word : words) {
            capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1).toLowerCase())
                             .append(" ");
        }

        return capitalizedTitle.toString().trim();
    }

    // Main method to test the Journal class
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter details for the journal
        System.out.print("Enter the author's name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter the title of the paper: ");
        String title = scanner.nextLine();

        System.out.print("Enter the submission date: ");
        String submissionDate = scanner.nextLine();

        // Create an object of Journal with user input
        Journal journal = new Journal(authorName, title, submissionDate);

        // Displaying the details of the journal entry
        System.out.println("\nJournal Entry Details:");
        journal.displayDetails();

        // Displaying the title with proper capitalization
        System.out.println("\nFormatted Paper Title: " + journal.getSubmissionDetails());
    }
}

