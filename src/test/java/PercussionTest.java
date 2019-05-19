import Instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

public class PercussionTest {

    Percussion percussion;

    @Before
    public void before(){
        percussion = new Percussion("Drumkit", 500, "Tama", "Boom");
    }


}
