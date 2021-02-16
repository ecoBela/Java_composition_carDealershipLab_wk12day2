import car.Doors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorsTest {

    Doors doors;

    @Before
    public void before(){
        doors = new Doors(4);
    }

    @Test
    public void hasQuantityOfDoors(){
        assertEquals(4, doors.getQuantity());
    }

}
