import car.VehicleType;
import dealership.Dealership;
import org.junit.Before;

import java.util.HashMap;

public class DealershipTest {

    Dealership dealership;
    HashMap<VehicleType, Integer> stock;

    @Before
    public void before(){
        dealership = new Dealership(50.00, stock);
    }
}
