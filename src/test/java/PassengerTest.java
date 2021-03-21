import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void setUp() {
        passenger1 = new Passenger("Sandy", 2);
        passenger2 = new Passenger("Mandy", 1);

    }

    @Test
    public void canGetName() {
        assertEquals("Sandy", passenger1.getName());
    }

    @Test
    public void canGetBag() {
        assertEquals(2, passenger1.getBag());
    }
}
