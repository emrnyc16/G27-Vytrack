package com.vytrack.tests.user_stories.nariman;

import com.vytrack.tests.user_stories.ermek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestCase4 extends TestBase {
    @Test
    public void test4(){
//     Given: user is on the login page
        driver.get("https://qa2.vytrack.com/");

//    When: user enters invalid Truck Driver username
        WebElement userNameInput = driver.findElement(By.id("prependedInput"));
        userNameInput.sendKeys("user178");

//    And: user enters invalid Truck Driver password
        WebElement passWordInput = driver.findElement(By.id("prependedInput2"));
        passWordInput.sendKeys("UserUser123789");

//    And: user clicks Login Button
        WebElement logInBtn = driver.findElement(By.id("_submit"));
        logInBtn.click();

//    Then: the message: Invalid user name or password. should be displayed
        WebElement invalidMsg = driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));
        invalidMsg.isDisplayed();
    }
    }

