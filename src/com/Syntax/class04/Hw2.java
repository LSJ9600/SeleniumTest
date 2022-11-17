package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
        /*
        HRMS Application Negative Login:
        Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text “Password cannot be empty” is displayed.
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement button= driver.findElement(By.id("btnLogin"));
        button.click();

        WebElement pword= driver.findElement(By.id("spanMessage"));

        Boolean statusDisplay=pword.isDisplayed();

        System.out.println("The error message is display: "+ statusDisplay);
    }
}
