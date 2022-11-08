package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        //click on create new account
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createAccount.click();
        //sleep time for the new window to load
        Thread.sleep(3000);
//send first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Judith");

        // send the last name
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Elemo");

        // send the email
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("judyelems@iqss.pro");

        // send the email confirmation
        WebElement confirmationEmail = driver.findElement(By.name("reg_email_confirmation__"));
        confirmationEmail.sendKeys("judyelems@iqss.pro");

        // send the password
        driver.findElement(By.name("reg_passwd__")).sendKeys("judyelems30");

//        find the WebElement dropDownn by looking for select tag
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
// use select class
        Select selectDay=new Select(day);

        selectDay.selectByIndex(24);
        Thread.sleep(3000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
// use select class
        Select selectMonth=new Select(month);
        selectMonth.selectByIndex(9);
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
// use select class
        Select selectYear =new Select(year);
        selectYear.selectByValue("1982");
        Thread.sleep(3000);

        //get the radio button female
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));

        //        check weather the radio button female is selcted
        boolean selectStatus = femaleRadioBtn.isSelected();

//check if the radio button male is not selected then click on it
        if(!selectStatus){
//            perfrom a click operation on the radio button
            femaleRadioBtn.click();
        }





    }
}
