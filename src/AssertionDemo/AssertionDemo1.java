package AssertionDemo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1
{
    @Test
    public void verify1()
    {
        Assert.assertEquals(1,1);
    }
    @Test
    public void verifySting()
    {
        Assert.assertEquals("Jitendra","Sharad");
    }


}
