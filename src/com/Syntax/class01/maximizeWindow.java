package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {
        /*
        go to google and maximize your window
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //maximize ur browser
        driver.manage().window().maximize();

        //fullscreen
        driver.manage().window().fullscreen();

        driver.quit();
    }
}
