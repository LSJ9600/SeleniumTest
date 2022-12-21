package com.Syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) {
        /*
        goto https://demo.guru99.com/test/simple_context_menu.html
        right click  on the button, select edit and handle the alert
        double click on the button and handle the alert
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        //right click  on the button
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        //select edit
        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        edit.click();
        //handle the alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        // double click on the button
        WebElement doubleClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleClick).perform();
        //handle the alert
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
    }
}
