package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Judith");
        driver.findElement(By.id("customer.lastName")).sendKeys("Elemo");
        driver.findElement(By.name("customer.address.street")).sendKeys("23 Cherry Tree Avenue");
        driver.findElement(By.id("customer.address.city")).sendKeys("Victoria Island");
        driver.findElement(By.id("customer.address.state")).sendKeys("Lagos");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("23401");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("234020000006");
        driver.findElement(By.id("customer.ssn")).sendKeys("234020");
        driver.findElement(By.id("customer.username")).sendKeys("jaydee");
        driver.findElement(By.name("customer.password")).sendKeys("jaydee234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("jaydee234");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);

        driver.quit();









    }
}
