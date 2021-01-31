package Test1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        Assert.assertEquals("getLocalNumber() not return 14", mainClass.getLocalNumber(), 14);
    }
}
