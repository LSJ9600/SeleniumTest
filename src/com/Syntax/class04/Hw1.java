package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify the message "Welcome Admin " is there on the top right corner
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.id("btnLogin"));
        button.click();

        WebElement admin= driver.findElement(By.id("welcome"));

        Boolean statusDisplay=admin.isDisplayed();

        System.out.println("The 'Welcome Admin' message is display: "+ statusDisplay);

    }
}
