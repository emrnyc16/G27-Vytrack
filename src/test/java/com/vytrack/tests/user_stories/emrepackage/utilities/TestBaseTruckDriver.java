package com.vytrack.tests.user_stories.emrepackage.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseTruckDriver {

    public WebDriver driver;
    @BeforeMethod
    public  void startUp(){
        driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userName=driver.findElement(By.xpath("//input[@name='_username']"));
        userName.sendKeys("user177");
        WebElement password= driver.findElement(By.xpath("//input[@*='password']"));
        password.sendKeys("UserUser123");

        WebElement login= driver.findElement(By.xpath("//button[.='Log in']"));
        login.click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
