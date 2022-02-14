import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CashTest {

    private Cash cash;
    @Before
    public void before(){
        cash = new Cash(10, "Pounds");
    }

    @Test
    public void hasValue(){
        assertEquals(10, cash.getValue());
    }
    @Test
    public void hasCurrencyType(){
        assertEquals("Pounds", cash.getCurrencyType());
    }
}
