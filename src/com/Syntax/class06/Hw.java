package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw {
    public static void main(String[] args) {
        /*
        HW: goto https://chercher.tech/practice/frames
        1.check the checkBox
        2.Select BabyCat from drop dwon
        3. Send text in text box "DONE"
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();


        //Task 1: checkBox
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        //Task 3: text
        WebElement inputTxt= driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("DONE");

        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        //Task 2: dropdown
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropdowm= driver.findElement(By.xpath("//select[@id='animals']"));
        Select select= new Select(dropdowm);
        select.selectByIndex(1);

    }
}
