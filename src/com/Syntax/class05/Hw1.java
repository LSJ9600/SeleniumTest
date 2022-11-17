package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Go to facebook
        2.click on create New Account
        3.Fill out the whole form
        4.Take screen shot of filled out form manually and share in HW channel along with code
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Lubna");
        driver.findElement(By.name("lastname")).sendKeys("Shelia");
        driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd1234");
        driver.findElement(By.name("birthday_month")).sendKeys("January");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
