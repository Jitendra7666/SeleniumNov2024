package TestNGDemo.Realsites;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Socialsites
{
    WebDriver driver;
// Sharad
    @BeforeClass
    public void OpenBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void instagram()
    {
        driver.get("https://www.instagram.com");
    }
}
