package AssertionDemo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginDemo
{
    @Test
    public void myTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("admin");
        driver.findElement(By.name("submit")).click();

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        //Assert.assertEquals(actual,expected);
        //Assert.assertEquals(actual,expected,  );
    }
}
