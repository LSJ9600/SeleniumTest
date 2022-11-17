package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Lubna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Shelia");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 Dee Road");
        driver.findElement(By.id("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.id("customer.address.state")).sendKeys("Illinois");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("32144");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("789-342-5425");
        driver.findElement(By.id("customer.ssn")).sendKeys("987-654-1120");
        driver.findElement(By.id("customer.username")).sendKeys("Lubna");
        driver.findElement(By.id("customer.password")).sendKeys("Abc1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Abc1234");
        Thread.sleep(5000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
