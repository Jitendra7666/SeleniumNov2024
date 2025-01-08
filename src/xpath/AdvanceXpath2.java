package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath2
{
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://demo.invoiceplane.com/sessions/login");

       driver.findElement(By.id("email")).sendKeys("admin@invoiceplane.com");
       driver.findElement(By.id("password")).sendKeys("demopassword");
       driver.findElement(By.xpath("//button[contains(@class,'primary')]")).click();
       Thread.sleep(2000);

      driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();
      // driver.findElement(By.xpath("//tr[td/a[text()='ABC Limited']]//li[2]")).click();

        ////a/i[contains(@class,'cog')]
      Thread.sleep(2000);
      driver.findElement(By.xpath("//tr[td/a[text()='ABC Limited']]//a/i[contains(@class,'cog')]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//tr[td/a[text()='ABC Limited']]//li[2]")).click();
      driver.findElement(By.id("client_surname")).sendKeys("Patel");
      driver.findElement(By.xpath("//button[@id=\"btn-submit\"]")).click();









    }
}
