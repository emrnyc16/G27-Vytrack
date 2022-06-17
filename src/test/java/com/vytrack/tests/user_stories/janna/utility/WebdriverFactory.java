package com.vytrack.tests.user_stories.janna.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverFactory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.toLowerCase().contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.toLowerCase().contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

        return null;

    }
}