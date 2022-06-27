package com.vytrack.tests.user_stories.maxim;

import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase08 extends TestBase {

    //8. Check if truck driver is able to search column name by entering text

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

        Thread.sleep(2000);

        WebElement gridSettingsBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        gridSettingsBtn.click();

        Thread.sleep(2000);

        // 4. When I type Id in the search window
        WebElement searchWindow = driver.findElement(By.xpath("//input[@data-role='column-manager-search']"));
        searchWindow.sendKeys("Id");

        // 5. The Id appears below in the window
        WebElement id = driver.findElement(By.xpath("//span[@class='column-filter-match']"));

        Assert.assertTrue(id.isDisplayed(),"Search window not working!");

        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase08.png"));



    }


}