package TestNGDemo.Demo2;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;

public class ClassOne
{
    @Test
    public void ClassOneTest1()
    {
        System.out.println("ClassOneTest1");
    }
    @Test (groups = "email")
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
