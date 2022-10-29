package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        //Click on start practicing
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(2000);

//click on simple form demo

        //comment out either method 1 or method 2 , u can not use them at the same time because they are clicking on the same button
       //  method1: click on demo using indexing
        driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

      //    method 2: click on demo using "and" operator in the xpath
//        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();

        Thread.sleep(2000);
//enter any text on first text box
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");

//click on show message
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
driver.quit();


    }
}
