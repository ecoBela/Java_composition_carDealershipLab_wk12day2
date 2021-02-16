import car.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(600);
    }
    @Test
    public void hasVolume(){
        assertEquals(600, engine.getVolume());
    }
}
