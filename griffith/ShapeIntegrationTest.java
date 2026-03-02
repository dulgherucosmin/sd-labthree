// Dulgheru Cosmin Alexandu 3161052

/* 
Integration tests that exercise multiple shape instances stored in an
ArrayList, checking overall behaviour of area and perimeter methods. 
*/

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;


public class ShapeIntegrationTest {
    
    /*
    This test loops through shapes and makes sure the values are valid (not negative or NaN)
     */
    @Test
    public void shapesIntegrationTest() {
        // arraylist for shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // create and add objects
        shapes.add(new Circle("Circle 1", 2.0));
        shapes.add(new Circle("Circle 2", 1.0));
        shapes.add(new Rhombus("Rhombus 1", 5.0, 6.0, 8.0));
        shapes.add(new Rhombus("Rhombus 2", 3.0, 4.0, 5.0));
        shapes.add(new RightAngledTriangle("Triangle 1", 3.0, 4.0));
        shapes.add(new RightAngledTriangle("Triangle 2", 6.0, 8.0));

        for (Shape shape : shapes) {
            double perimeter = shape.perimeter();
            // test that perimeter is non-negative
            assertTrue(perimeter >= 0);

            double area = shape.area();
            // test that area is non-negative
            assertTrue(area >= 0);
        }

    }

    /*
    This test loops through shapes and tests specific values
    */
    @Test
    public void shapeValuesTest() {
        // 
        ArrayList<Shape> shapes = new ArrayList<>();

        // add objects with known values
        Circle circle1 = new Circle("Circle 1", 2.0);
        Circle circle2 = new Circle("Circle 2", 1.0);
        shapes.add(circle1);
        shapes.add(circle2);

        Rhombus rhombus1 = new Rhombus("Rhombus 1", 5.0, 6.0, 8.0);
        Rhombus rhombus2 = new Rhombus("Rhombus 2", 3.0, 4.0, 5.0);
        shapes.add(rhombus1);
        shapes.add(rhombus2);

        RightAngledTriangle triangle1 = new RightAngledTriangle("Triangle 1", 3.0, 4.0);
        RightAngledTriangle triangle2 = new RightAngledTriangle("Triangle 2", 6.0, 8.0);
        shapes.add(triangle1);
        shapes.add(triangle2);

        // test specific values
        assertEquals(Math.round((2 * Math.PI * 2)*100/100), circle1.perimeter(), 0.1);
        assertEquals(Math.round((Math.PI * 2 * 2)*100/100), circle1.area(), 0.1);

        assertEquals(Math.round((2 * Math.PI * 1)*100/100), circle2.perimeter(), 0.1);
        assertEquals(Math.round((Math.PI * 1 * 1)*100/100), circle2.area(), 0.1);

        assertEquals(4 * 5.0, rhombus1.perimeter(), 0.1);
        assertEquals(0.5 * 6.0 * 8.0, rhombus1.area(), 0.1);

        assertEquals(4 * 3.0, rhombus2.perimeter(), 0.1);
        assertEquals(0.5 * 4.0 * 5.0, rhombus2.area(), 0.1);

        assertEquals(Math.round((3.0 + 4.0 + Math.sqrt(9 + 16))*100/100), triangle1.perimeter(), 0.1);
        assertEquals(0.5 * 3.0 * 4.0, triangle1.area(), 0.1);

        assertEquals(Math.round((6.0 + 8.0 + Math.sqrt(36 + 64))*100/100), triangle2.perimeter(), 0.1);
        assertEquals(0.5 * 6.0 * 8.0, triangle2.area(), 0.1);

        // test that all 6 shapes were added
        assertEquals(6, shapes.size());
    }
}
