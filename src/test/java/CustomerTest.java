import car.Car;
import dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    ArrayList<Car>cars;

    @Before
    public void before(){
        customer = new Customer(50000.00, cars);
    }

    @Test
    public void hasMoney(){
        assertEquals(50000.00, customer.getMoney(), 0.01);
    }
}
