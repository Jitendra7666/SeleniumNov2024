package TestNGDemo.Demo1;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo
{
    @BeforeTest
    public void BeforeMyTest()
    {
        System.out.println("BeforeMyTestClassTwo");
    }
    @AfterTest
    public void AfterMyTest()
    {
        System.out.println("AfterMyTestClassTwo");
    }

    @Test
    public void ClassTwoTest1()
    {
        System.out.println("ClassTwoTest1");
    }
    @Test
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
