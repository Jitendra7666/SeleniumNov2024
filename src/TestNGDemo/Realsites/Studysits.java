package TestNGDemo.Realsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Studysits
{
    WebDriver driver;

    public void setDriver(WebDriver driver)
    {
    }

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
    public void w3school()
    {
        driver.get("https://www.w3schools.com");
    }
    @Test
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com");
    }
}
