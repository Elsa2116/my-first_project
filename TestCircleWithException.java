
class CircleWithException {
    private double radius;

    // Construct a circle with a specified radius 
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    // Return the area of this circle
    public double findArea() {
        return radius * radius * Math.PI; // Using Math.PI for better precision
    }
}

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            System.out.println("Circle 1 radius: " + c1.getRadius());
            System.out.println("Circle 1 area: " + c1.findArea());

            CircleWithException c2 = new CircleWithException(-5); // This will throw an exception
            System.out.println("Circle 2 radius: " + c2.getRadius());
            System.out.println("Circle 2 area: " + c2.findArea());

            CircleWithException c3 = new CircleWithException(0);
            System.out.println("Circle 3 radius: " + c3.getRadius());
            System.out.println("Circle 3 area: " + c3.findArea());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

