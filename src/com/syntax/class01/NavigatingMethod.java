package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingMethod {
    public static void main(String[] args) throws InterruptedException {
        //Go to google.com
        // Go to facebook.com
        //Go back to google.com

        //set the path to the driver to link it with the class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to google
        driver.get("https://www.google.com");

        //Navigate to facebook
driver.navigate().to("https://www.facebook.com");

//Introduce sleep which is wait.Wait or pause for 2000 mili seconds(2sec)
        Thread.sleep(2000);
        // go back to google.com
        driver.navigate().back();

        //Introduce sleep which is wait.Wait or pause for 2000 mili seconds(2sec)
        Thread.sleep(2000);

//go back to facebook
        driver.navigate().forward();

        //Introduce sleep which is wait.Wait or pause for 000 mili seconds(1 sec)
        Thread.sleep(1000);

        //Refresh page
        driver.navigate().refresh();
//quit
        driver.quit();

    }
}
