// Dulgheru Cosmin Alexandru 3161052

/*
•	Create an abstract class Shape
o	Add a private String name
o	Add a constructor that sets name
o	Add getters and setters.
o	Add two abstract methods double area() and double perimeter()
o	Add a toString method that prints name.

*/

public class Shape {

    private String name;

    public Shape(String name) {
        
        // data validation
        if (name == null) {
            throw new IllegalArgumentException("Shape Name cannot be null.");
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