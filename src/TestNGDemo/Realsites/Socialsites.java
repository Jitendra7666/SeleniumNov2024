package TestNGDemo.Realsites;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Socialsites
{
    WebDriver driver;
   @BeforeClass
    public void OpenBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closebroswer()
    {
        driver.close();
    }
    @Test
    public void instagram()
    {
        driver.get("https://www.instagram.com");
    }
    @Test
    public void facebook()
    {
        driver.get("https://www.facebook.com");
    }
    @Test
    public void linkedin()
    {
        driver.get("https://www.linkedin.com");
    }
}
