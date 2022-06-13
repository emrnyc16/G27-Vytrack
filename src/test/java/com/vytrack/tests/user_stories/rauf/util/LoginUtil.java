package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtil {


    public static void loginAnyUser(WebDriver driver){
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user177");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
