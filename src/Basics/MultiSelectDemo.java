package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.click.in/pune/classifieds/60/post.html");

        Thread.sleep(4000);

        WebElement drpDwn = driver.findElement(By.id("source_118"));
        Select SelText = new Select(drpDwn);
        SelText.selectByIndex(2);
        SelText.selectByIndex(3);
        SelText.selectByIndex(4);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();
        Thread.sleep(2000);

        Thread.sleep(2000);
        WebElement drpDwn2 = driver.findElement(By.id("fld_118"));
        Select SelText2 = new Select(drpDwn2);
        SelText.selectByIndex(0);
        SelText.selectByIndex(1);
        SelText.selectByIndex(2);

//        WebElement dropDwn = driver.findElement(By.id("source_508"));
//        Select selText  = new Select(dropDwn);
//
//        selText.selectByIndex(0);
//        selText.selectByIndex(1);
//        selText.selectByIndex(2);

    }
}
