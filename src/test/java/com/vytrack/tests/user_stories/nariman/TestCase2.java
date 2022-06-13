package com.vytrack.tests.user_stories.nariman;

import com.vytrack.tests.user_stories.ermek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase2 extends TestBase {
//    Given: Truck Driver user is on the Dashboard page
    @Test
    public void test2() throws IOException, InterruptedException{
        driver.get("https://qa2.vytrack.com/");
        UtilN.VyTrackLog(driver, "user178", "UserUser123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



//    When: user clicks Vehicles feature under Fleet module
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        WebElement vehiclesFeature = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        vehiclesFeature.click();
        Thread.sleep(2000);


//    Then: user should be able to navigate to the Vehicles page
        String actualTitle = driver.getTitle();
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
