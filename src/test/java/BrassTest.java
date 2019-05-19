import Instruments.Brass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;

    @Before
    public void before(){
        brass = new Brass("Yamaha", 100, "Trumpet", "Toot");
    }

    @Test
    public void isATypeOfBrassInstrument(){
        assertEquals("Trumpet", brass.getBrand());
    }

    @Test
    public void instrumentHasASound(){
        assertEquals("This instrument makes a sound like a Toot", brass.instrumentCanPlay());
    }
}
