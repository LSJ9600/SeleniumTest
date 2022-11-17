package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //find the webElement button
       WebElement btn=driver.findElement(By.cssSelector("button#buttoncheck"));

       //get the text from the btn webElement
        String text=btn.getText();

        //print it on console
        System.out.println("The text in the button is: " + text);

        //get the value of the attribute "id" from this webElement
        String idValue= btn.getAttribute("id");

        //print it on the console
        System.out.println("The value of the attribute id is: " + idValue);
    }
}
