import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Fender", 500);
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", instrument.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(500, instrument.getPrice());
    }

    @Test
    public void AbleToSetPriceOfInstruments(){
        instrument.setPrice(350);
        assertEquals(350, instrument.getPrice());
    }


}
