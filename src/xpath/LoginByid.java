package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByid
{
    public static void main(String[] args)
    {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://stock.scriptinglogic.in/");

       WebElement txtusername = driver.findElement(By.id("login-username"));
       txtusername.sendKeys("admin");

       WebElement PassWord = driver.findElement(By.id("login-password"));
       PassWord.sendKeys("admin");

       driver.findElement(By.name("submit")).click();

    }
}
