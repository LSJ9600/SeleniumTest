package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw1 {
    public static void main(String[] args) {
        /*
        1.goto
        http://accounts.google.com/signup
        2.click on help and privacy btn
        3.click on community Button
        4.goto gmail.com page and enter your user name in form
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        String mainPage=driver.getWindowHandle();

        //click on help button
        WebElement helpButton=driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

        //click on the privacy button
        WebElement privacyButton= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        //find the community button and click on it
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            WebDriver page = driver.switchTo().window(handle);
            driver.switchTo().window(handle);
        }
        WebElement cButton=driver.findElement(By.xpath("//a[text()='Community']"));
        cButton.click();

        //go to gmail.com and enter your user name
        driver.switchTo().window(mainPage);
        WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
        user.sendKeys("Lubna");
    }
}
