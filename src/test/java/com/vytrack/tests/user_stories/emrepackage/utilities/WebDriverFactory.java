package com.vytrack.tests.user_stories.emrepackage.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        WebDriver driver;

        switch (browserType.toLowerCase()){

            case "chrome":
            case "c":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "safari":
            case "s":
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
            case "f":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Invalid entry");
                driver= null;
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

    public static void explicitWait(WebDriver driver, String location){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(location))).click();
    }
}

