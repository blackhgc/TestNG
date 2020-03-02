package testNg;

import org.testng.annotations.*;

/**
 * 2020.2.27
 */
public class TestNgDemo {

    @BeforeClass
    public void beforeclass(){
        System.out.println("这是TestNg注释beforeclass");
    }

    @BeforeMethod
    public void beforethod(){
        System.out.println("这是TestNg注释beforemethod");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("这是TestNg注释aftermethod");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("这是TestNg注释beforetest");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("这是TestNg注释aftertest");
    }

    @Test
    public void testCase1(){
        System.out.println("这是TestNg注释1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是testNg注释2");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("这是testNg注释afterclass");
    }

    @BeforeGroups
    public void beforegroup(){
        System.out.println("这是testNg注释beforegroup");
    }
    @BeforeSuite
    public void beforesuit(){
        System.out.println("这是testNg注释beforesuit");
    }


}
