package com.vytrack.tests.user_stories.kate_package.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackLogin {
    // For logging into Vytrack:

    public static void vytrack_login(WebDriver driver, String username, String password){
        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='_username']"));
        inputUserName.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='_password']"));
        inputPassword.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();
    }
}
