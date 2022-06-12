package com.vytrack.tests.user_stories.ermek.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Util {
    public static void loginAnyUser(WebDriver driver,String username,String password){
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
