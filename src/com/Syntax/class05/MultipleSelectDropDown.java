package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");

        //maximize window
        driver.manage().window().maximize();

        //find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//      using select class
        Select sel=new Select(DD);

//      By index
        sel.selectByIndex(3);

//      By visible text
        sel.selectByVisibleText("Texas");

        Thread.sleep(3000);

        //deselect by index
        sel.deselectByIndex(3);

        //code to select all the options in the drop down
        List<WebElement> options = sel.getOptions();

        for(int i=0; i<options.size(); i++) {

            sel.selectByIndex(i);
        }

        Thread.sleep(3000);

        //deselects all the options in the drop down
        sel.deselectAll();

        //check if the drop down is multi select or not using selenium
        boolean multi = sel.isMultiple();
        System.out.println(multi);

    }
}
