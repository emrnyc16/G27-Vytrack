package com.vytrack.tests.user_stories.maxim;

import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import com.vytrack.tests.user_stories.rauf.util.OtherUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase07 extends TestBase {

//7. Check if truck driver is able to click Select all button


        @Test
        public void confirmAllSelected() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login
            driver.get("https://qa2.vytrack.com/user/login");
            WebElement userName = driver.findElement(By.id("prependedInput"));
            userName.sendKeys("user177");

            WebElement passWord = driver.findElement(By.id("prependedInput2"));
            passWord.sendKeys("UserUser123");

            WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
            logInBtn.click();

            WebElement fleetClass = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            fleetClass.click();

            WebElement vehiclesClass = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
            vehiclesClass.click();

            // 3. Given I am on the "Grid Settings" window, click on the "Grid Settings" button
            // WebElement gridSettingsBtn = driver.findElement()

            Thread.sleep(2000);

            WebElement gridSettingsBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
            gridSettingsBtn.click();

            Thread.sleep(2000);
            WebElement selectAllBtn = driver.findElement(By.linkText("Select All"));
            //selectAllBtn.click();

            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();",selectAllBtn );

            String selectAll = selectAllBtn.getAttribute("class");

            Assert.assertTrue(selectAll.contains("disabled"),"Select All button failed to select all options!");

            File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase07.png"));



        }


    }



