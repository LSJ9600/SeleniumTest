package com.Syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) {
        /*
        Go to syntax hrms .
        Go-to the recruitment tab.
        From the calendar  just select a date
        8 August 2023
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find and click on the recruitment tab
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();
        //find and click on the calendar tab
        WebElement calendarTab = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendarTab.click();
        //choose the month drop down and pick the month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        select.selectByVisibleText("Aug");
        //choose the year drop down and pick the year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        select1.selectByVisibleText("2023");
        //choose the date
        WebElement date = driver.findElement(By.xpath("//a[text()='8']"));
        date.click();
    }
}
