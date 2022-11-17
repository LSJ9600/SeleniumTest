package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        //maximize window
        driver.manage().window().maximize();

        //find all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //traverse through list of checkboxes to find the desired one
        for (WebElement checkBox : checkBoxes) {
            //get the attribute value to check if this is the right option to select
            String optionName = checkBox.getAttribute("value");
            //if condition to make sure it if the right checkbox
            if (optionName.equalsIgnoreCase("Option-2")) {
//            if passed click on it
                checkBox.click();
            }

        }
    }
}
