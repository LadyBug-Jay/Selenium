package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();

        driver.get("https://web.facebook.com/");
        //enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadaba");

//click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
    }
}
