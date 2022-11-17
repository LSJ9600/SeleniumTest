package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw3 {
    public static void main(String[] args) {
        /*
        1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
        2.Click on start button
        3. get the text Welcome Syntax technologies and print on console
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button.click();

        WebElement welcomeText= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeText.getText();
        System.out.println("The text is: "+ text);

        /*
        The text could be empty for the following reasons
        1) the DOM has display:none
        2) the WebDriver sees the text on DOM before it shows on the UI
        3) you need an explicit wait to sync with both DOM and UI
         */
    }
}
