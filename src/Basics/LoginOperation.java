package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperation
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/admin/");

        driver.findElement(By.id("input-username")).clear();
        driver.findElement(By.id("input-password")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("input-username")).sendKeys("demo");
        Thread.sleep(2000);
        driver.findElement(By.id("input-password")).sendKeys("demo");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();

    }
}
