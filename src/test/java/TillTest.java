import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(500);
    }

    @Test
    public void hasMoneyInTill(){
        assertEquals(500, till.moneyInTill());
    }

    @Test
    public void canRemoveMoneyFromTill(){
        till.removeMoney(100);
        assertEquals(400, till.moneyInTill());
    }

    @Test
    public void canAddMoneyFromTill(){
        till.addMoney(500);
        assertEquals(1000, till.moneyInTill());
    }


}
