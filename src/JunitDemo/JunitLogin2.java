package JunitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class JunitLogin2
{
    WebDriver driver;    // ====================Declares the driver as globally
    @Before   // Method below this annotation will run before every test method
    public void OpenBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After  // Method below this annotation will run after every test method
    public void CloseBrowser()
    {
        driver.close();
    }
    @Test
    public void myTest1()
    {
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("");
        driver.findElement(By.name("submit")).click();
  }
    @Test   
    public void myTest2()
    {
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("qauser");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("test123");
        driver.findElement(By.name("submit")).click();
    }
    @Test
    public void myTest3()
    {
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("admin");
        driver.findElement(By.name("submit")).click();
       }
}
