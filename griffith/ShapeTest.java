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

        // perimeter tests
        assertEquals(13, circ.perimeter(), 0.1);
        assertEquals(628, circ2.perimeter(), 0.1);
        assertEquals(0, circ3.perimeter(), 0.1);

        // area tests
        assertEquals(13, circ.area(), 0.1);
        assertEquals(31415.9, circ2.area(), 0.1);
        assertEquals(0, circ3.area(), 0.1);

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
    
}
