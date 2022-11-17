package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Go to ebay.com
        2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
        3.select Computers/Tables & Networking
        4.click on search
        5.verify the title
         */

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.ebay.com");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel=new Select(dropdown);


        //print the drop down on concole
        List<WebElement> options = sel.getOptions();

        for(int i=0;i<options.size();i++){

            String dd = options.get(i).getText();
            System.out.println(dd);
        }

        //select from the drop down and click on it
        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //verify the title
        String title= driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title is verified");
        }else {
            System.out.println("The title is incorrect");
        }

    }
}
