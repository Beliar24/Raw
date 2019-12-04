import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    int a;
    int b;

    @Before
    public void setUp() {
        a = 10;
        b = 2;
    }
    @Test
    public void testSum() {
        int result = 12;
        Assert.assertEquals("10+2 = 12", result, Calc.sum(a, b));

    }
    @Test
    public void testSub() {
        int result = 8;
        Assert.assertEquals("10-2=8",result,Calc.sub(a,b));

    }
    @Test
    public void testMult() {
        int result = 20;
        Assert.assertEquals("10*2=20",result,Calc.mult(a,b));
    }

    @Test
    public void testdiv() {
        int result = 5;
        Assert.assertEquals("10/2 = 5",result,Calc.div(a,b));
    }

}
