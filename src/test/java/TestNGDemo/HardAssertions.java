package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssertions {

    public void assertEquals(){
        String name = "Jayanthi";
        String name2 = "Jayanth";
        //String name2 = "Jayanthi";
        Assert.assertEquals(name,name2,"Name not matched");

    }
    @Test(priority = 1)
    public void assertTrue(){
        int  a = 10;
        int b = 5;
        Assert.assertTrue(a<b,"condition made to false");//if condition is true the test pass
        System.out.println("False");

}
    @Test(priority = 2)
    public void assertFalse(){
    int a = 10;
    int b= 20;
    Assert.assertFalse(a>b,"condition made to true"); // if condition is false then test  pass
}
}