package com.Syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //     find the radio Button

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        traverse through the list of webElements
        for(WebElement radioBtn:radioBtns){

//            find the desired radio button
            String option = radioBtn.getAttribute("value");

            if(option.equalsIgnoreCase("5 - 15")){
//                click on the radio Btn
                radioBtn.click();

            }

        }

    }
}
