package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        //get the webElement text box
        //driver.findElement(By.cssSelector("input[placeholder *='your']")).sendKeys("Hello everyone");

        //another method of doing the ABOVE method
        WebElement textBox= driver.findElement(By.cssSelector("input[placeholder *='your']"));
        textBox.sendKeys("Hello everyone");

        //press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        button.click();

    }
}
