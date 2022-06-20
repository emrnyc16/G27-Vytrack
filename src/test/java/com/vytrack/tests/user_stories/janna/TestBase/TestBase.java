package com.vytrack.tests.user_stories.janna.TestBase;

import com.vytrack.tests.user_stories.janna.utility.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
