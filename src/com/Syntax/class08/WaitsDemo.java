package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


        // click on the button 'change text to selenium webdriver'
        WebElement button1= driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

        // get the text selenium webdriver
        WebElement webDriverText= driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));

        // print it out on the console
        System.out.println(webDriverText.getText());


        // TASK 2-click on the button 'display button after 10 seconds'
        WebElement button2= driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();

        // as the button appears up after some time so in order to click it or get text from it
        // we need to define some explicit wait
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

        WebElement visiblebtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visiblebtn.click();
    }
}
