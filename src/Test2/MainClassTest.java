package Test2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("getClassNumber() return number not more 45",
                mainClass.getClassNumber() > 45);
    }

}
