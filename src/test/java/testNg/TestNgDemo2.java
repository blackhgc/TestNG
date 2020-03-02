package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo2 {
    @Test
    public void assertEqualTest(){
        String a="asd";
        String b="asd";

        Assert.assertEquals(a,b,"a不等于b");
        Assert.assertEquals(a,b);
    }

    @Test
    public void assertIntEqualTest(){
        String a="asd";
        String b="asddf ";

        Assert.assertNotEquals(a,b);
    }

    @Test
    public void assertNull(){
        String a=null;
        Assert.assertNull(a);
    }

    @Test
    public void asserttrue(){
        Boolean a=true;
        Assert.assertTrue(a);
    }
}
