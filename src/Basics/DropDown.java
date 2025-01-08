package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lifepartner.in/");

        Thread.sleep(2000);
        WebElement wb = driver.findElement(By.id("sel3"));   //Find web Element
        Select select = new Select(wb);                      //Create select object
        select.selectByVisibleText("Groom");                 //Select by Visible Text/ByValue/ByIndex

        Thread.sleep(2000);

        WebElement age = driver.findElement(By.id("sel1"));
        Select sel = new Select(age);
        sel.selectByVisibleText("19");

        Thread.sleep(2000);

        WebElement age1 = driver.findElement(By.id("sel2"));
        Select sell = new Select(age1);
        sell.selectByVisibleText("20");

        Thread.sleep(2000);

        WebElement com = driver.findElement(By.id("sel4"));
        Select sel2 = new Select(com);
        sel2.selectByVisibleText("Hindu");

        Thread.sleep(2000);

        WebElement ms = driver.findElement(By.id("sel5"));
        Select sel3 = new Select(ms);
        sel3.selectByVisibleText("Married earlier");

        Thread.sleep(2000);

        driver.findElement(By.className("search-btn")).click();




















//
//
//



    }
}
