// Abstract base class for all sports
abstract class Sport {
    protected String name;

    public Sport(String name) {
        this.name = name;
    }

    public abstract void displayStats(); // Abstract method for displaying statistics
}

// Concrete subclasses for specific sports
class Baseball extends Sport {
    private int runs;
    private int hits;
    private int errors;

    public Baseball(String name, int runs, int hits, int errors) {
        super(name);
        this.runs = runs;
        this.hits = hits;
        this.errors = errors;
    }

    @Override
    public void displayStats() {
        System.out.println("Baseball Stats for " + name + ":");
        System.out.println("Runs: " + runs);
        System.out.println("Hits: " + hits);
        System.out.println("Errors: " + errors);
    }
}

class Basketball extends Sport {
    private int points;
    private int rebounds;
    private int assists;

    public Basketball(String name, int points, int rebounds, int assists) {
        super(name);
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    @Override
    public void displayStats() {
        System.out.println("Basketball Stats for " + name + ":");
        System.out.println("Points: " + points);
        System.out.println("Rebounds: " + rebounds);
        System.out.println("Assists: " + assists);
    }
}

// ... other sports (Soccer, Football, etc.) would be similar subclasses ...

public class SportsStats {
    public static void main(String[] args) {
        Baseball baseball = new Baseball("Yankees", 10, 15, 3);
        Basketball basketball = new Basketball("Lakers", 120, 50, 30);

        baseball.displayStats();
        System.out.println(); // Added a blank line for better readability
        basketball.displayStats();
    }
}
