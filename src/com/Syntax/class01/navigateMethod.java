package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        /*
        go to google.com
        go to facebook.com
        back to google.com
        go back to facebook.com
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://facebook.com/");

        //introduce some sleep which is wait between changes by adding exception to method signature
        Thread.sleep(2000); //2secs wait time between changes

        driver.navigate().back();
        Thread.sleep(2000); //2secs wait time between changes
        driver.navigate().forward();
        Thread.sleep(2000); //2secs wait time between changes
        //to refresh the page
        driver.navigate().refresh();
        //to quit
        driver.quit();
    }
}
