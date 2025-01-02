package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByXpath
{
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://stock.scriptinglogic.in/");

//       WebElement txtusername = driver.findElement(By.xpath("//input[@name = \"username\"]"));
//       txtusername.sendKeys("admin");
//
//       WebElement PassWord = driver.findElement(By.xpath("//input[@name=\"password\"]"));
//       PassWord.sendKeys("admin");
//
//       driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();    //      //tagname[@attribute='value']


        // driver.findElement(By.xpath("//a[@href=\"add_customer.php\"]")).click();

        //driver.findElement(By.xpath("//a[text()=\"Add Customer\"]")).click(); //      //tagname[text()=”Some text”]

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()=\"Forgot your password?\"]")).click();
                        //tagname[normalize-space]

        driver.findElement(By.xpath(""));





    }
}
