package com.vytrack.tests.user_stories.kate_package;

import com.vytrack.tests.user_stories.kate_package.test_base.TestBase;
import com.vytrack.tests.user_stories.kate_package.utilities.VytrackLogin;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase21 extends TestBase {

    @Test
    public void vytrack_saveEvent_invalidDates() throws IOException, InterruptedException {

        // 1. Goes to vytrack login page:
        driver.get("https://qa2.vytrack.com/user/login");

        // enters username and password, then clicks on Login button:
        VytrackLogin.vytrack_login(driver, "user177", "UserUser123");
        Thread.sleep(3000);

        // Click on Fleet module
        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetModule.click();
        Thread.sleep(3000);

        // Click on Vehicles feature
        WebElement vehicles = driver.findElement(By.xpath("//span[@class='title title-level-2'][1]"));
        vehicles.click();
        Thread.sleep(3000);
        // Click on the 2nd license plate 123456
        WebElement vehicle = driver.findElement(By.xpath("//td[.='123456'][1]"));
        vehicle.click();
        Thread.sleep(3000);

        // 2. Locate the "Add Event" button and click on it

        // Lines 47 and 48 control when the "Add Event" pop-up window will appear. It will wait until the specified car general information is dispalyed.
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), '123456')]")));

        // click on the "Add Event" button. Then the pop-up window should appear:
        WebElement addEventBtn = driver.findElement(By.xpath("//a[contains(@data-url, 'event/create')]"));
        addEventBtn.click();
        Thread.sleep(3000);

        // Enter a title in the Title field
        WebElement eventTitle = driver.findElement(By.xpath("//input[@data-name='field__title']"));
        eventTitle.sendKeys("Test Event TC21");
        Thread.sleep(2000);

        // Enter Organizer's name in the Organizer's name field:
        WebElement organizerName = driver.findElement(By.xpath("//input[@data-name='field__organizer-display-name']"));
        organizerName.sendKeys("Test Dude");
        Thread.sleep(2000);

        // Enter valid Organizer's email in the Organizer email field:
        WebElement organizerEmail = driver.findElement(By.xpath("//input[@data-name='field__organizer-email']"));
        organizerEmail.sendKeys("user456@aol.com");
        Thread.sleep(2000);

        // Locate the date field and clear the data:
        WebElement startDate = driver.findElement(By.xpath("(//input[contains(@id, 'date_selector')])[1]"));
        startDate.clear();


        // 3. Verify if "This value should not be blank." message appears:
        WebElement invalidDateMsg = driver.findElement(By.xpath("//span[.='This value should not be blank.']"));
        String actualErrMsg = invalidDateMsg.getText();
        System.out.println("invalidDateMsg = " + invalidDateMsg);
        String expectedErrMsg = "This value should not be blank.";
        System.out.println("expectedErrMsg = " + expectedErrMsg);

        Assert.assertEquals(actualErrMsg, expectedErrMsg, "Invalid Email Error Message did not appear correctly!");

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\Users\\kolib\\Desktop\\Vytrack\\TC21_Negative.png"));

//
//        //TODO: automate scrolling down the page for a better screenshot
    }


}
