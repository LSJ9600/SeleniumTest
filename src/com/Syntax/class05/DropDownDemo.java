package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");

        //maximize window
        driver.manage().window().maximize();

        //find the WebElement dropdown by looking for select tag
        WebElement dropdowm= driver.findElement(By.xpath("//select[@id='select-demo']"));

        //use Select Class
        Select select= new Select(dropdowm);

        //select an option by index
        select.selectByIndex(5);

        Thread.sleep(3000);

        //select by visible text
        select.selectByVisibleText("Saturday");

        Thread.sleep(3000);

        //select by value
        select.selectByValue("Sunday");

        //get all the options available in the dropdown
        List<WebElement> options = select.getOptions();

        //traverse through these options
        for (int i=0; i<options.size(); i++) {

            WebElement option = options.get(i);
            String text = option.getText();
            if (text.equalsIgnoreCase("Friday")) {
                select.selectByIndex(i);
            }
        }
    }
}
