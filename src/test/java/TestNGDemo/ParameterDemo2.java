package TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2 {
    @Test
    @Parameters({"Browser","IPAddress","Operating System"})
    public void loginTest(String browser,String ipAddress, String osName){
        System.out.println("Browser Name is " + browser);
        System.out.println("Its IP Address is  " + ipAddress);
        System.out.println("It uses the operating System : " + osName);


    }

}