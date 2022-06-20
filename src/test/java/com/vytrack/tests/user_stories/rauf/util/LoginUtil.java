package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtil {




    public static void login(){

        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfReader.getProperty("truckUser"));
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfReader.getProperty("truckPassword"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();


    }
}
