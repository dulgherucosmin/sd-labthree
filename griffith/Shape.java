// Dulgheru Cosmin Alexandru 3161052

public class Shape {

    private String name;

    public Shape(String name) {
        
        // data validation
        if (name == null || name == "") {
            throw new IllegalArgumentException("Shape Name cannot be null or an empty string.");
        }

        this.name = name;
    }

    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    /* GETTERS */
    public String getName() {
        return this.name;
    }

    /* SETTERS */
    public void setName(String newName) {

        // data validation
        if (newName == null) {
            throw new IllegalArgumentException("Shape name cannot be null.");
        }

        this.name = newName;
    }

}