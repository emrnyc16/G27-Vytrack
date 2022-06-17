package com.vytrack.tests.user_stories.oguzhan.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    public static void login_Vytrack(WebDriver driver, String username, String password) {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@type='text']"));
        usernameBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();

    }

}
