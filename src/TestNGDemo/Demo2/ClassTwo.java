package TestNGDemo.Demo2;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo
{
    @Test
    public void ClassTwoTest1()
    {
        System.out.println("ClassTwoTest1");
    }
    @Test (groups ="email")
    public void ClassTwoTest2()
    {
        System.out.println("ClassTwoTest2");
    }
    @Test
    public void ClassTwoTest3()
    {
        System.out.println("ClassTwoTest3");

    }

}
