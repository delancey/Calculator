import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    //use annotation when you're expecting a Runtime Exception, not any return value
    @Test(expected = RuntimeException.class)
    public final void threeOrMoreNumbersThrowsException(){
        Calculator.add("1,2,3");

    }

    @Test
    public final void twoNumbersUsedNoExceptionThrown(){
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void NonNumberUsed(){
        Calculator.add("1,X");

    }

    @Test
    public final void emptyStringReturnsZero(){
        Assert.assertEquals(0, Calculator.add(""));
    }

    @Test
    public final void oneNumberUsed(){
        Assert.assertEquals(3, Calculator.add("3"));
    }

    @Test
public final void twoNumbersUsedReturnSum(){
    Assert.assertEquals(3+6, Calculator.add("3,6"));
}


}