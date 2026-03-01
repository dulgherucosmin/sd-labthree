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
    
}
