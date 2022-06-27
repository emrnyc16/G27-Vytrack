package com.vytrack.tests.user_stories.maxim;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.security.Permission;
import java.util.concurrent.TimeUnit;

public class TestCase11 extends TestBase {


    //   7. As an authorized user I can access Vehicle Contract page


    @Test
    public void confirmAllSelected() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("storemanager210");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        WebElement fleetClass = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']"));
        fleetClass.click();

        WebElement vehiclesContractsClass = driver.findElement(By.linkText("Vehicle Contracts"));
        vehiclesContractsClass.click();

        String actual = driver.getTitle();

       Assert.assertTrue(actual.contains("Vehicle Contract"));

        Thread.sleep(2000);

        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase11.png"));



    }
}
