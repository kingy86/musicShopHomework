import Instruments.Brass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;

    @Before
    public void before(){
        brass = new Brass("Trumpet", 100, "Yamaha", "Toot");
    }

    @Test
    public void isABrandOfBrassInstrument(){
        assertEquals("Yamaha", brass.getBrand());
    }

    @Test
    public void instrumentHasASound(){
        assertEquals("This instrument makes a sound like a Toot", brass.instrumentCanPlay());
    }

    @Test
    public void isATypeOfBrassInstrument(){
        assertEquals("Trumpet", brass.instrumentType());
    }
}
