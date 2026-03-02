// Dulgheru Cosmin Alexandru 3161052

/* 
Represents a circle, overrides methods for calculating perimeter and area.
*/ 

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double perimeter() {

        // radius cannot be negative, test fails
        if (radius <= -1) { return -1; }

        // round to 2 dp
        return Math.round(((2 * Math.PI * this.radius) * 100) / 100);
    }
    
    @Override
    public double area() {
        
        // radius cannot be negative, test fails
        if (radius <= -1) { return -1; }

        // round to 2 dp
        return Math.round(((Math.PI * this.radius * this.radius) * 100)/ 100);
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nRadius: " + this.radius + " units";
    }

}
