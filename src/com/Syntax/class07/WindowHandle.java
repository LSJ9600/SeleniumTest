package com.Syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        //task: go to gmail signup page and get the window handle

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        //gets the window handle for the current page
        String gmailHandle =driver.getWindowHandle();

        //print on console
        System.out.println("The handle of the current page is: "+ gmailHandle);
    }
}
