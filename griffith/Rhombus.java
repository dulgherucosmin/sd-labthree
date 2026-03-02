// Dulgheru Cosmin Alexandru 3161052

public class Rhombus extends Shape {

    private double sideLength;
    private double diagonalOne;
    private double diagonalTwo;

    public Rhombus(String name, double sideLength, double diagonalOne, double diagonalTwo) {
        super(name);
        this.sideLength = sideLength;
        this.diagonalOne = diagonalOne;
        this.diagonalTwo = diagonalTwo;
    }

    @Override
    public double perimeter() {

        // no values can be negative, test fails
        if (sideLength <= -1 || diagonalOne <= -1 || diagonalTwo <= -1) { return -1; }

        return 4 * sideLength;
    }
    
    @Override
    public double area() {

        // no values can be negative, test fails
        if (sideLength <= -1 || diagonalOne <= -1 || diagonalTwo <= -1) { return -1; }

        return diagonalOne * diagonalTwo * 0.5;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nSide Length: " + this.sideLength + " units\nDiagonals: " + diagonalOne + " and " + diagonalTwo + " units";
    }
    
}
