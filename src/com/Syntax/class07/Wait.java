package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //is this example you need explicit wait

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        //click on the start button
        WebElement startButton= driver.findElement(By.id("startButton"));
        startButton.click();

        //get the text
        WebElement welcomeText= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeText.getText();
        System.out.println("The text is: "+ text);
    }
}
