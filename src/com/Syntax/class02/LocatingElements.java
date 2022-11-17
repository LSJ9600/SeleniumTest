package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //go to facebook
        //Enter Username
        //Enter password
        //Click login

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //enter the username in the textbox-locate element and send the keys
        driver.findElement(By.id("email")).sendKeys("asfdsasdafdf");
        //enter the password
        driver.findElement(By.name("pass")).sendKeys("abcde12345");
        //click the login button
        driver.findElement(By.name("login")).click();

        //for the following task2 to work please make sure that you comment the login functionality

        //task 2 -click on forgot password
        //driver.findElement(By.linkText("Forgot password?")).click();

        //for the following task3 to work please make sure that you comment the login functionality and task 2

        //task 3- click on forgot password with partial linktext locator
        //driver.findElement(By.partialLinkText("Forgot")).click();


    }
}
