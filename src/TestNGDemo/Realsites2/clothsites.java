package TestNGDemo.Realsites2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class clothsites
{
    WebDriver driver;

    @BeforeClass
    public void openbrower()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closebrower()
    {
        driver.close();
    }
    @Test
    public void asos()
    {
        driver.get("https://www.asos.com/us/");
    }
    @Test
    public void modcloth()
    {
        driver.get("https://modcloth.com/");
    }


}
