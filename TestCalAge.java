import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class CalAge {
    private LocalDate dateOfBirth;

    // Method to set date of birth
    public void setDateOfBirth(String dobInput) {
        if (isValidDate(dobInput)) {
            this.dateOfBirth = LocalDate.parse(dobInput, DateTimeFormatter.ISO_LOCAL_DATE);
        } else {
            throw new IllegalArgumentException("Invalid date of birth entered. Please enter a valid date in YYYY-MM-DD format.");
        }
    }

    // Method to calculate detailed age
    public String getDetailedAge() {
        if (dateOfBirth == null) {
            throw new IllegalStateException("Date of birth is not set.");
        }
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return String.format("%d years, %d months, and %d days", period.getYears(), period.getMonths(), period.getDays());
    }

    // Method to check if the date entered is valid
    private boolean isValidDate(String dateString) {
        try {
            LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

public class TestCalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalAge calAge = new CalAge();

        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        try {
            calAge.setDateOfBirth(dobInput);
            String detailedAge = calAge.getDetailedAge();
            System.out.println("Your age is " + detailedAge);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
