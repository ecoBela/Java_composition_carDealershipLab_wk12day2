import car.Seats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {
    Seats seats;

    @Before
    public void before(){
        seats = new Seats(5, "velvet");
    }

    @Test
    public void hasQuantityOfSeats(){
        assertEquals(5, seats.getQuantity());
    }

    @Test
    public void hasLining(){
        assertEquals("velvet", seats.getLining());
    }
}
