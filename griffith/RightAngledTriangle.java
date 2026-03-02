// Dulgheru Cosmin Alexandru 3161052

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;
    private double hyp;
    private double adj;

    public RightAngledTriangle(String name, double base, double height, double hyp, double adj) {
        super(name);
        this.base = base;
        this.height = height;
        this.hyp = hyp;
        this.adj = adj;
    }
    
    @Override
    public double perimeter() {
        
        // no values can be negative, test fails
        if (base <= -1 || height <= -1 || hyp <= -1 || adj <= -1) {
            return -1;
        }

        return base + hyp + adj;
    }

    @Override
    public double area() {

        // no values can be negative, test fails
        if (base <= -1 || height <= -1 || hyp <= -1 || adj <= -1) {
            return -1;
        }

        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nBase: " + base + " units\nHeight: " + height + " units\nHyp: " + hyp + " units\nAdj: " + adj + " units";
    }

}
