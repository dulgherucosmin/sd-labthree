// Dulgheru Cosmin Alexandru 3161052

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeTest {

    /*
    Perimeter
    - positive, negative, 0

    Area
    - positive, negative, 0

    toString
    normal string, empty, null
    */

    @Test
    public void CircleTest() {

        // create objects for testing
        Circle circ = new Circle("Circle 1", 2);
        Circle circ2 = new Circle("Circle 2", 100);
        Circle circ3 = new Circle("Circle 3", 0);
        // circle 4 strictly for negative test
        Circle circ4 = new Circle("Circle 4", -1);

        // perimeter tests
        // C = 2 * PI * r
        double expected1 = 2 * Math.PI * 2;
        assertEquals(Math.round((expected1 * 100) / 100), circ.perimeter(), 0.1);

        double expected2 = 2 * Math.PI * 100;
        assertEquals(Math.round((expected2 * 100) / 100), circ2.perimeter(), 0.1);

        double expected3 = 2 * Math.PI * 0;
        assertEquals(Math.round((expected3 * 100) / 100), circ3.perimeter(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, circ4.perimeter(), 0.1);

        // area tests
        // A = PI r^2
        double expected4 = Math.PI * 2 * 2;
        assertEquals(Math.round((expected4 * 100) / 100), circ.area(), 0.1);

        double expected5 = Math.PI * 100 * 100;
        assertEquals(Math.round((expected5 * 100) / 100), circ2.area(), 0.1);

        double expected6 = Math.PI * 0 * 0;
        assertEquals(Math.round((expected6 * 100 / 100)), circ3.area(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, circ4.area(), 0.1);

        // toString tests
        assertEquals("Name: Circle 1\nRadius: 2.0 units", circ.toString());
        assertEquals("Name: Circle 2\nRadius: 100.0 units", circ2.toString());
        assertEquals("Name: Circle 3\nRadius: 0.0 units", circ3.toString());

    }

    // test empty string
    @Test(expected=IllegalArgumentException.class)
    public void CircleTestEmpty() {
        assertNotNull(new Circle("", 1));
    }

    // test null
    @Test(expected=IllegalArgumentException.class)
    public void CircleTestNull() {
        assertNotNull(new Circle(null, 1));
    }

    @Test
    public void RhombusTest() {

        // create objects for testing
        Rhombus rhom = new Rhombus("Rhombus 1", 1, 1, 1);
        Rhombus rhom2 = new Rhombus("Rhombus 2", 20, 30, 40);
        Rhombus rhom3 = new Rhombus("Rhombus 3", 0, 0, 0);
        // rhombus 4 strictly for negative tests
        Rhombus rhom4 = new Rhombus("Rhombus 4", -1, -1, -1);

        // perimeter tests
        // A = pi
        assertEquals(4, rhom.perimeter(), 0.1);
        assertEquals(80, rhom2.perimeter(), 0.1);
        assertEquals(0, rhom3.perimeter(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, rhom4.perimeter(), 0.1);

        // area tests
        assertEquals(0.5, rhom.area(), 0.1);
        assertEquals(600, rhom2.area(), 0.1);
        assertEquals(0, rhom3.area(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, rhom4.area(), 0.1);

        // toString tests
        assertEquals("Name: Rhombus 1\nSide Length: 1.0 units\nDiagonals: 1.0 and 1.0 units", rhom.toString());
        assertEquals("Name: Rhombus 2\nSide Length: 20.0 units\nDiagonals: 30.0 and 40.0 units", rhom2.toString());
        assertEquals("Name: Rhombus 3\nSide Length: 0.0 units\nDiagonals: 0.0 and 0.0 units", rhom3.toString());
    }

    // test empty string
    @Test(expected=IllegalArgumentException.class)
    public void RhombusTestEmpty() {
        assertNotNull(new Rhombus("", 1, 1, 1));
    }

    // test null
    @Test(expected=IllegalArgumentException.class)
    public void RhombusTestNull() {
        assertNotNull(new Rhombus(null, 1, 1, 1));
    }
 
    @Test
    public void RightAngledTriangleTest() {

        // create objects for testing
        RightAngledTriangle tri = new RightAngledTriangle("Triangle 1", 1, 1);
        RightAngledTriangle tri2 = new RightAngledTriangle("Triangle 2", 10, 5);
        RightAngledTriangle tri3 = new RightAngledTriangle("Triangle 3", 0, 0);
        // triangle 4 strictly for negative tests
        RightAngledTriangle tri4 = new RightAngledTriangle("Triangle 4", -1, -1);

        // perimeter tests
        assertEquals(3, tri.perimeter(), 0.1);
        assertEquals(26, tri2.perimeter(), 0.1);
        assertEquals(0, tri3.perimeter(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, tri4.perimeter(), 0.1);

        // area tests
        assertEquals(0.5, tri.area(), 0.1);
        assertEquals(25, tri2.area(), 0.1);
        assertEquals(0, tri3.area(), 0.1);
        // negative test fails: returns -1
        assertEquals(-1, tri4.area(), 0.1);

        // toString tests
        assertEquals("Name: Triangle 1\nBase: 1.0 units\nHeight: 1.0 units", tri.toString());
        assertEquals("Name: Triangle 2\nBase: 10.0 units\nHeight: 5.0 units", tri2.toString());
        assertEquals("Name: Triangle 3\nBase: 0.0 units\nHeight: 0.0 units", tri3.toString());

    }

    // test empty string
    @Test(expected=IllegalArgumentException.class)
    public void RightAngledTriangleTestEmpty() {
        assertNotNull(new RightAngledTriangle("", 1, 1));
    }

    // test null
    @Test(expected=IllegalArgumentException.class)
    public void RightAngledTriangleTestNull() {
        assertNotNull(new RightAngledTriangle(null, 1, 1));
    }

}
