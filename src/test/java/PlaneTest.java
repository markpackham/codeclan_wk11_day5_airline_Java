import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.TINYPLANE);
        plane2 = new Plane(PlaneType.SMALLPLANE);
        plane3 = new Plane(PlaneType.BIGPLANE);
        plane4 = new Plane(PlaneType.HUGEPLANE);
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Frank", 2);
        passenger3 = new Passenger("Greg", 3);
        passenger4 = new Passenger("Jimmy", 1);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(2, plane1.getPlaneType().capacity);
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(3, plane2.getPlaneType().totalWeight);
    }


}
