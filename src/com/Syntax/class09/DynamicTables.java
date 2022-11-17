package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        //enter user
        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("Tester");
        //enter pass
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        //click on log in
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();
        //check the checkBox that contains 'screen saver' as a project
        List<WebElement> secondColumn = driver.findElements(By.xpath("/table[@class='SampleTable']/tbody/tr/th[3]"));

        for(int i=0; i<secondColumn.size();i++){

            String columnText = secondColumn.get(i).getText();
//            check for the desired value
            if(columnText.equalsIgnoreCase("ScreenSaver")) {
//   print out the index of the column/row which contains the Screen saver
                System.out.println("the index of the row which contains the Screen Saver is " + (i + 1));
//  click on the checkbox
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkBox.click();
            }
        }
            }
}
