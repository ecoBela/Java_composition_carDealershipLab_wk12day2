import car.Wheels;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelsTest {
    Wheels wheels;

    @Before
    public void before(){
        wheels = new Wheels(4, "magnesium");
    }

    @Test
    public void hasQuantity(){
        assertEquals(4, wheels.getQuantity());
    }
    @Test
    public void hasMaterial(){
        assertEquals("magnesium", wheels.getMaterial());
    }


}
