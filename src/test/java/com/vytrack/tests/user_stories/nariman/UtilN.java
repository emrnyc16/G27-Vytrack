package com.vytrack.tests.user_stories.nariman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtilN {
    public static void VyTrackLog(WebDriver driver,String username,String password){
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();

    }
}
