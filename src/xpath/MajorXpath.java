package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class MajorXpath
{
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://stock.scriptinglogic.in/");

       WebElement txtusername = driver.findElement(By.id("login-username"));
       txtusername.sendKeys("admin");

       WebElement PassWord = driver.findElement(By.id("login-password"));
       PassWord.sendKeys("admin");

       driver.findElement(By.name("submit")).click();

       driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
       Thread.sleep(2000);


        driver.findElement(By.xpath("//a[text()='View Customers']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//tr[td[text()='adarsh']]/td/a[contains(@class ,'edit')]")).click();

        Thread.sleep(4000);
    }
}
