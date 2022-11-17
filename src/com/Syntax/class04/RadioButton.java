package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

//        get the radio button Male
           WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
//        check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
//        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

        // check whether the radio button male is Enabled
        boolean enableStatus =maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled: "+ enableStatus);

        //check whether the radio button male is Selected
        boolean selectStatus= maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected: "+ selectStatus);

        //check is the radio button male is not selected than click on it
        if(!selectStatus){
            maleRadioBtn.click();
        }

        //check the status now
        selectStatus= maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected: "+ selectStatus);
    }
}
