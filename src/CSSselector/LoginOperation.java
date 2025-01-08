package CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginOperation
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://stock.scriptinglogic.in/");

        driver.findElement(By.cssSelector("input#login-username")).sendKeys("admin");       //   tagName#idValue
        driver.findElement(By.cssSelector("input#login-password")).sendKeys("admin");       //   tagName#idValue
        //driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.findElement(By.cssSelector("input.button")).click();                                      //   tagName.class














    }
}
