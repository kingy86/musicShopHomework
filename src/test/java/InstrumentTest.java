import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Guitar", 500);
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", instrument.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(500, instrument.getPrice());
    }
}
