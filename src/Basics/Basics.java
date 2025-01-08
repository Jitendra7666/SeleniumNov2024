package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     //Use to maximize screen

        driver.get("https://facebook.com");
        Thread.sleep(2000);                 // Use to add buffer time

        driver.switchTo().newWindow(WindowType.WINDOW); //Switches to new window
        driver.get("https://instagram.com");

        driver.close();         //  Use to close current window
        driver.quit();          // Use to close all opened window




    }
}
