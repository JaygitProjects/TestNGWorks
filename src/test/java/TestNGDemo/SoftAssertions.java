package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    SoftAssert softAssert = new SoftAssert();

    @Test

    void testSoftAssert(){

        int a = 100;
        int b = 50;
        System.out.println("First line of assertion");

        softAssert.assertEquals(a ,b,"Assert Equals made to false");//fail
       // softAssert.assertTrue(a>b,"condition made to true");
        softAssert.assertTrue(a<b,"Assert true  made to false");//fail
        softAssert.assertTrue(true,"Assert true  made to true");//pass
        softAssert.assertFalse(true,"Assert False  made to true1");//fail
        softAssert.assertFalse(a<b,"Assert False made to true");//pass

        System.out.println("Last Line of Assertion");

    }
@Test(priority =1)
    public void assertingAll(){
        softAssert.assertAll();//to execute all assertions above
}

}
