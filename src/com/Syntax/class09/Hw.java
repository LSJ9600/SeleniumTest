package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) {
        /*
        go to the url - http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        click on PIM
        click on Employee List
        from the table choose one id (it must be from the first page)
        and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
        username: admin & password:Hum@nhrm123
         */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton= driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        List<WebElement> idList = driver.findElements(By.xpath("//table[@class = 'table hover']/tbody/tr/td[2]"));

        for (int i = 0; i < idList.size(); i++) {
            String idText = idList.get(i).getText();

            if (idText.equalsIgnoreCase("5675733")) {

                int rowNum = i + 1;

                WebElement checkbox = driver.findElement(By.xpath("//table[@class = 'table hover']/tbody/tr[" + rowNum + "]/td[1]"));
                checkbox.click();
            }
        }
    }
}
