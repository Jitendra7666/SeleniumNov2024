package TestNGDemo.Realsites2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Marriagesites
{
    WebDriver driver;

    @BeforeClass
    public void openbrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closebrowser()
    {
        driver.close();
    }
    @Test
    public void shaddi()
    {
        driver.get("https://www.shaadi.com/");
    }
    @Test (priority = 1)
    public void sangam()
    {
        driver.get("https://www.sangam.com/");
    }
}

