package TestNGDemo;

import org.omg.Dynamic.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
    @Test
    @Parameters("Browser")
    public void loginTest(String browser){
        System.out.println("Browser Name is "+browser);

    }
}
