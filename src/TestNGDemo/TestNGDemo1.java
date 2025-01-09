package TestNGDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestNGDemo1
{
    @Test
    public void myTest1()
    {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        driver.close();

    }
    @Test
    public void myTest2()
    {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("qauser");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("test123");
        driver.findElement(By.name("submit")).click();
        driver.close();

    }
    @Test
    public void myTest3()
    {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("");
        driver.findElement(By.name("submit")).click();
        driver.close();

    }
}
