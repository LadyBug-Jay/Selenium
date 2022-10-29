package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        //sleep time for the new window to load
        Thread.sleep(3000);

        //send first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Judith");

        // send the last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Elemo");
        // send the email
        driver.findElement(By.name("reg_email__")).sendKeys("judyelems@iqss.pro");
        // send the email confirmation
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("judyelems@iqss.pro");
        // send the password
        driver.findElement(By.name("reg_passwd__")).sendKeys("judyelems30");

        //        close the popup window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zG')]")).click();
        Thread.sleep(5000);
// close the browser
        driver.quit();


    }
    
    
    
}
