package TestNGDemo;


import org.testng.annotations.Test;

public class GroupTrial {
    @Test(groups= {"Sanity"})
    public void LoginT1(){
        System.out.println("Test1");

    }
    @Test(groups= {"Sanity"})
    public void LoginT2(){
        System.out.println("Test2");

    }
    @Test(groups= {"Sanity"})
    public void LoginT3(){
        System.out.println("Test3");

    }
    @Test(groups= {"Regression"})
    public void LoginT4(){
        System.out.println("Test4");

    }
    @Test(groups= {"Regression"})
    public void LoginT5(){
        System.out.println("Test5");

    }
    @Test(groups= {"Sanity","Regression"})
    public void LoginT6(){
        System.out.println("Test6 ");

    }
    @Test(groups= {"smoke"})
    public void LoginT7(){
        System.out.println("Test7");

    }
    @Test(groups= {"smoke","Sanity","Regression"})
    public void LoginT8(){
            System.out.println("Test8");


    }
}
