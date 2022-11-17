package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) {
        /*
        go to https://the-internet.herokuapp.com/dynamic_controls
        click on checkbox and click on remove
        verify the text
        click on enable verify the textbox is enabled
        enter text and click disable
        verify the textbox is disabled
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //click on checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        //click on remove
        WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();
        //verify its removed
        WebElement gone = driver.findElement(By.xpath("//p[@id='message']"));
        String goneText = gone.getText();
        System.out.println(goneText);
        //click on enable
        WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
        enable.click();
        //verify the textbox is enabled
        WebElement enableButton= driver.findElement(By.xpath("//p[@id='message']"));
        String enableText = enableButton.getText();
        System.out.println(enableText);
        //enter text
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Hello");
        //click disable
        WebElement disable = driver.findElement(By.xpath("//button[text()='Disable']"));
        disable.click();
        //verify the textbox is disabled
        WebElement disableButton= driver.findElement(By.xpath("//p[@id='message']"));
        String disableText = disableButton.getText();
        System.out.println(disableText);

    }
}
