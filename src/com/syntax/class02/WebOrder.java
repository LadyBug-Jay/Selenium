package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();


        // task1: Go to smartbear.com
        //use the get() function to open up the required website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//maximaize window
        driver.manage().window().maximize();

        //enter username in the text box
        //Step 1. locate the element and send keys
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

//enter password in the text box
        //Step 1. locate the element and send keys
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
// click login
        driver.findElement(By.className("button")).click();

        // make sure title is correct
String title =driver.getTitle();
if(title.equalsIgnoreCase("Web Orders")){
    System.out.println("The title is correct "+title);
}else {
    System.out.println("The title is incorrect "+title);

}
//Introduce sleep which is wait.Wait or pause for 2000 mili seconds(2sec)
        Thread.sleep(2000);
driver.quit();


    }
}
