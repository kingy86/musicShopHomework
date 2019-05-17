import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instruments.Instrument instruments;
    Till till;

    @Before
    public void before(){
        shop = new Shop("Mark's Music Shop");

    }

    @Test
    public void hasName(){
        assertEquals("Mark's Music Shop", shop.getName());
    }
}
