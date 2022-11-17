package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();

        //go to smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize the window
        driver.manage().window().maximize();

        //Enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //Enter the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //click login
        driver.findElement(By.className("button")).click();

        //Make sure the title is correct i.e Web Orders
        String title= driver.getTitle();
        //System.out.println(title);

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct: "+ title);
        }else {
            System.out.println("The title is incorrect: "+ title);
        }

    }
}
