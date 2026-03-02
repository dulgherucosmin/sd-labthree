// Dulgheru Cosmin Alexandru 3161052

/* 
Represents a right-angled triangle, overrides methods for calculating perimeter and area.
*/ 

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double perimeter() {
        
        // no values can be negative, test fails
        if (base <= -1 || height <= -1) {
            return -1;
        }

        // a + b + sqrt(a^2+b^2)
        // sqrt(a^2+b^2) gets c, the hypotenuse
        double result = base + height + Math.sqrt((base * base) + (height * height));
        // round to 2dp
        return Math.round((result * 100) / 100);
    }

    @Override
    public double area() {

        // no values can be negative, test fails
        if (base <= -1 || height <= -1) {
            return -1;
        }

        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nBase: " + base + " units\nHeight: " + height + " units";
    }

}
