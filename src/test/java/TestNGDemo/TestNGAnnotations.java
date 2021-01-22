package TestNGDemo;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGAnnotations {

   @Test
    public void print() {
        System.out.println("Open Browser");

    }

    @Test(dependsOnMethods = {"print"})
    public void print2() {
        System.out.println("Login to webSight");

    }

    @Test(dependsOnMethods = {"print2"})
    public void print3() {
        //int x = 10 / 0;
        System.out.println("print x");

    }

    @Test(dependsOnMethods = {"print3"})
    public void print4() {
        System.out.println("Checkout");

    }


    @Test
    public void print9() {
        System.out.println("Test  9");
        throw new SkipException("Error Found");
    }

    @BeforeSuite()
    public void print5() {
        System.out.println("Test 5");

    }

    @BeforeTest
    public void print6() {
        System.out.println("Test 6");

    }

    @BeforeClass
    public void print7() {
        System.out.println("Test 7");
    }

    @BeforeMethod
    public void print8() {
        System.out.println("Test  8");

    }

    @BeforeMethod
    public void print8_1() {
        System.out.println("Test  8");

    }

    @AfterSuite
    public void print10() {
        System.out.println("Test  10");
    }

    @AfterSuite
    public void print10_1() {
        System.out.println("Test  10 ");
    }

    @AfterTest
    public void print11() {
        System.out.println("Test 11");

    }

    @AfterTest
    public void print11_1() {
        System.out.println("Test 11");

    }

    @AfterClass
    public void print12() {
        System.out.println("Test  12");

    }

    @AfterMethod
    public void print13() {
        System.out.println("Test  13");

    }

    @AfterMethod
    public void print13_1() {
        System.out.println("Test  13");
    }
}
