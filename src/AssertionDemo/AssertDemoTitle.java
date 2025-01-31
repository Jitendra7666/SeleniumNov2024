package AssertionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemoTitle
{
    WebDriver driver;
    @Test
    public void openbrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
    }
    @Test
    public void verify()
    {
        String ActualResult =  driver.getTitle();
        String expectedtitle = "POSNIC - Login to Control Panel";
        Assert.assertEquals(ActualResult,expectedtitle);
    }
    @Test
    public void verify2()
    {
        String ActualResult =  driver.getTitle();
        String expectedtitle = "POSNIC - Login to Control Panel";
        Assert.assertNotEquals(ActualResult,expectedtitle);
    }
}
