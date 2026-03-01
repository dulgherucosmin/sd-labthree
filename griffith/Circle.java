// Dulgheru Cosmin Alexandru 3161052

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        // round to 2 dp
        return Math.round(((2 * Math.PI * this.radius) * 100) / 100);
    }
    
    @Override
    public double area() {
        // round to 2 dp
        return Math.round(((Math.PI * this.radius * this.radius) * 100)/ 100);
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nRadius: " + this.radius + " units";
    }

}
