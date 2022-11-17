package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //Task 1 Print animals on screen and check the checkbox

        //Step1: switch to the frame using index
        driver.switchTo().frame(1);

        //find the text animals and print on screen
        WebElement animalText= driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text= animalText.getText();
        System.out.println(text);

        /*
        //select the dropdown pick baby cat
        WebElement dropdowm= driver.findElement(By.xpath("//select[@id='animals']"));
        Select select= new Select(dropdowm);
        select.selectByIndex(1);
        */

        //check the checkbox
        driver.switchTo().defaultContent();

        //switch to the frame containing the subframe which has checkbox
        driver.switchTo().frame("frame1");

        /* WebElement inputTxt= driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("hello");
         */

        //finding the frame through xpath and switching using by WebELement method
        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        //click the checkbox
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

    }
}
