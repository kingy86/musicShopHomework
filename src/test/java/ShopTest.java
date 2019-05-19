import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instruments.Instrument instrument;
    Till till;

    @Before
    public void before(){
        shop = new Shop("Mark's Music Shop");
        instrument = new Instrument("Fender", 500);

    }

    @Test
    public void hasName() {
        assertEquals("Mark's Music Shop", shop.getName());
    }

    @Test
    public void hasNoInstruments(){
        assertEquals(0, shop.instrumentCount());
    }

    @Test
    public void canBuyInstruments(){
        shop.buyInstrument(instrument);
        assertEquals(1, shop.instrumentCount());
    }

    @Test
    public void canSellInstruments(){
        shop.buyInstrument(instrument);
        shop.buyInstrument(instrument);
        shop.buyInstrument(instrument);
        shop.sellInstrument(instrument);
        assertEquals(2, shop.instrumentCount());
    }
}
