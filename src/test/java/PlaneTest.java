import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.AIRBUS_A380);
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.AIRBUS_A380, plane.getPlaneType());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(575, plane.getWeight());
    }

    @Test
    public void planeHasCapacity () {
        assertEquals(850, plane.getCapacity());
    }
}
