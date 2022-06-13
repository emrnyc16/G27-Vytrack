package com.vytrack.tests.user_stories.nariman;

import com.vytrack.tests.user_stories.ermek.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase1 extends TestBase {
    @Test
    public void test1() {


//        Given: user is on the login page

        driver.get("https://qa2.vytrack.com/");

//        When: user enters a valid Truck Driver username

        WebElement userNameInput = driver.findElement(By.id("prependedInput"));
        userNameInput.sendKeys("user178");

//        And: user enters  a valid Truck Driver password

        WebElement passWordInput = driver.findElement(By.id("prependedInput2"));
        passWordInput.sendKeys("UserUser123");

//        And: user clicks Login Button
        WebElement logInBtn = driver.findElement(By.id("_submit"));
        logInBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        Then: user should be able to login

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test failed!!");



    }

}
