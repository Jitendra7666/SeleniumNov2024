package TestNGDemo.Demo1;


import org.testng.annotations.*;

public class ClassOne
{
    @BeforeSuite
    public void BeforeMysuite()
    {
        System.out.println("BeforeMysuiteClassOne");
    }
    @AfterSuite
    public void AfterMysuite()
    {
        System.out.println("AfterMysuiteClassOne");
    }
    @Test
    public void ClassOneTest1()
    {
        System.out.println("ClassOneTest1");
    }
    @Test
    public void ClassOneTest2()
    {
        System.out.println("ClassOneTest2");
    }
    @Test
    public void ClassOneTest3()
    {
        System.out.println("ClassOneTest3");

    }

}
