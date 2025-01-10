package TestNGDemo.Realsites;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jobsites
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
    public void naukari()
    {
        driver.get("https://www.naukri.com/");
    }
    @Test
    public void monster()
    {
        driver.get("https://www.foundit.in/");
    }

}
