package xpath;

import dev.failsafe.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdvanceXpath
{
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       //driver.implicitly_wait(10);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();


       driver.get("https://stock.scriptinglogic.in/");

       WebElement txtusername = driver.findElement(By.id("login-username"));
       txtusername.sendKeys("admin");

       WebElement PassWord = driver.findElement(By.id("login-password"));
       PassWord.sendKeys("admin");

       driver.findElement(By.name("submit")).click();

       driver.findElement(By.xpath("//a[normalize-space()=\"Add Sales\"]")).click();
      // Thread.sleep(2000);
       driver.findElement(By.xpath("//a[normalize-space()='View Sales']")).click();
       //Thread.sleep(2000);
       driver.findElement(By.xpath("//tr[td[text()=' jacob']]//a[contains(@class,'edit')]")).click();

            //Clicks on Add Customer
       driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
      // Thread.sleep(2000);

            //Clicks on View Customers
       driver.findElement(By.xpath("//a[text()='View Customers']")).click();
       //Thread.sleep(4000);

            //Clicks on Edit button
       /*driver.findElement(By.xpath("//tr[td[text()='adarsh']]/td/a[contains(@class ,'edit')]")).click();
       Thread.sleep(4000);*/

            //Clicks on Delete button
      /* driver.findElement(By.xpath("//tr[td[text()='Veena']]//td/a[contains(@class,'delete')]")).click();
       Thread.sleep(4000);*/

            //Tick on Checkbox
       WebElement Chekbx = driver.findElement(By.xpath("//tr[td[text()='Veena']]//input[@id='check_box']"));
       Chekbx.click();

       //Thread.sleep(2000);
            //UnTick on Checkbox
       Chekbx.click();
    }
}
