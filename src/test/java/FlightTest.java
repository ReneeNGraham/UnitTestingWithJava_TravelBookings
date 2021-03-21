import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Flight flight3;
    Plane plane1;
    Plane plane2;
    Plane plane3;


    @Before
    public void setUp() {
        flight1 = new Flight(plane1, "LN756", "GLA", "LDN", "15:00" );
        flight2 = new Flight(plane2, "HL567", "JHB", "AMT", "12:00" );
        flight3 = new Flight(plane3, "FR", "EDI", "PRS", "21:00" );
        plane1 = new Plane(PlaneType.AIRBUS_BELUGA_XL);
        plane2 = new Plane(PlaneType.BOEING_747);
        plane3 = new Plane(PlaneType.AIRBUS_A380);
    }
}

