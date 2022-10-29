package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        //go to google
        //Maximize your window

        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

// create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to google
        driver.get("https://www.google.com");

        //Maximize
        driver.manage().window().maximize();
        //Full screen
       // driver.manage().window().fullscreen();

        //quit
        driver.quit();




    }
}
