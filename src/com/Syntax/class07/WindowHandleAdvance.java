package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        //click on help button
        WebElement helpButton=driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

        //click on the privacy button
        WebElement privacyButton= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        //the title of my desired page is 'Google Account Help'
        //to move to the help page - get all the window handles first
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);

            //now get the title of the window to which the driver has switch
            String title =driver.getTitle();

            //compare now the title with your desired page
            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is: "+ title);
                break;
            }
        }

        //find the community button and click on it
        WebElement cButton=driver.findElement(By.xpath("//a[text()='Community']"));
        cButton.click();
    }
}
