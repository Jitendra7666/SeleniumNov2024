package JunitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JunitDemo1
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("");
        WebElement PassWord = driver.findElement(By.id("login-password"));
        PassWord.sendKeys("");
        driver.findElement(By.name("submit")).click();
        driver.close();   //======================================>Closes the current window

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver1.manage().window().maximize();
        driver1.get("https://stock.scriptinglogic.in/");
        WebElement txtusername1 = driver1.findElement(By.id("login-username"));
        txtusername1.sendKeys("qauser");
        WebElement PassWord1 = driver1.findElement(By.id("login-password"));
        PassWord1.sendKeys("test123");
        driver1.findElement(By.name("submit")).click();
        driver1.close();

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver2.manage().window().maximize();
        driver2.get("https://stock.scriptinglogic.in/");
        WebElement txtusername2 = driver2.findElement(By.id("login-username"));
        txtusername2.sendKeys("admin");
        WebElement PassWord2 = driver2.findElement(By.id("login-password"));
        PassWord2.sendKeys("admin");
        driver2.findElement(By.name("submit")).click();
        driver2.close();
    }
}
