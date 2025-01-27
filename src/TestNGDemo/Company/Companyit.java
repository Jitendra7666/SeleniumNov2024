package TestNGDemo.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Companyit
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
    public void webmigrates()
    {
        driver.get("https://staging.greatwisher.com/webmigrates/");
    }

}
