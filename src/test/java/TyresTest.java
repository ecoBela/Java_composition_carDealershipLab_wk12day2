import car.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(1.6, "summer");
    }

    @Test
    public void hasTreadWear(){
        assertEquals(1.6, tyres.getTreadWear(), 0.01);
    }
    @Test
    public void hasType(){
        assertEquals("summer", tyres.getTyreType());
    }

    @Test
    public void canChangeTyres(){
        tyres.setTyreType("winter");
        assertEquals("winter", tyres.getTyreType());

    }


}
