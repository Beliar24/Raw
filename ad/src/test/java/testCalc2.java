import org.junit.Assert;
import org.junit.Test;

public class testCalc2 {
    int a = 10;
    int b = 2;

    @Test
    public void testSum() {
        int result = 12;
        Assert.assertEquals("10+2 = 12",result);
    }


}
