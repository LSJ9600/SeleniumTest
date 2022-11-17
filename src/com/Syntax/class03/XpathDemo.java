package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //enter username
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dfgevhjhg");
        //enter password
        //driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("asdef123");
        //forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
    }
}
