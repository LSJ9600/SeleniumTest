package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    /*
    this is The HomeWork- you must use Relative Xpath to do this
    Note: you are free to choose the type of relative Xpath, but try to use the one that seems more appropriate
    Navigate to http://syntaxprojects.com/
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),' Start Practising')]")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Selenium is not as complicated as expected");
        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
