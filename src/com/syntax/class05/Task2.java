package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto ebay.com
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();


//       find the WebElement dropDown by looking for select tag
        WebElement dropDownCat = driver.findElement(By.xpath("//select[@id='gh-cat']"));
// use select class
        Select selectCat = new Select(dropDownCat);

        List<WebElement> options = selectCat.getOptions();
//        traverse through the options
        for (WebElement option: options) {
            String category= option.getText();
            System.out.println(category);
            }




        }

    }
