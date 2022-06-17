package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtil {




    public static void login(WebDriver driver){

        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfReader.getProperty("truckUser"));
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfReader.getProperty("truckPassword"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
}
