package com.vytrack.tests.user_stories.maxim.utilities;

import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {


    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

//     1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}