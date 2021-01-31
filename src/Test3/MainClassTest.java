package Test3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("getClassString() not contains 'hello' or 'Hello'",
                mainClass.getClassString().contains("hello") ||
                mainClass.getClassString().contains("Hello"));
    }
}
