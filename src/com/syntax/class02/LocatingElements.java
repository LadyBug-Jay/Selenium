package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
    //Go to facebook
    //Enter username
    //Enter password
    //Click login

        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://web.facebook.com/");

        //maximaize window
        driver.manage().window().maximize();

        //enter username in the text box
        //Step 1. locate the element and send keys
        driver.findElement(By.id("email")).sendKeys("abracadaba");

        //enter the password in the text box
        driver.findElement(By.name("pass")).sendKeys("waow12345678");

        //click the login button
        //driver.findElement(By.name("login")).click();

        //For the below task to work comment login functionality
//          task2:
//          Click on forgot password using linkText

        driver.findElement(By.linkText("Forgotten password?")).click();

        //For the below task to work comment login functionality and forgot password using linkText
//         task3:
//          Click on forgot password using Partial linkText locator
        //driver.findElement(By.partialLinkText("Forgotten")).click();


    }


}
