package com.vytrack.tests.user_stories.maxim;

import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase13 extends TestBase {

    // As an authorized user I can create "Vehicle Fuel Logs" event

    @Test
    public void createVehicleEvent() throws InterruptedException, IOException {

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

        WebElement fleetFuelLog = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
        fleetFuelLog.click();

        WebElement createVehicleFuelLogs = driver.findElement(By.linkText("Create Vehicle Fuel Logs"));
        createVehicleFuelLogs.click();

        WebElement odometerValue = driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']"));
        odometerValue.sendKeys("35467");

        WebElement liter = driver.findElement(By.cssSelector("input[data-ftid='custom_entity_type_Liter']"));
        liter.sendKeys("60");

        WebElement pricePerLiter = driver.findElement(By.cssSelector("input[name='custom_entity_type[PricePerLiter]']"));
        pricePerLiter.sendKeys("7");


        WebElement totalPrice = driver.findElement(By.cssSelector("input[name='custom_entity_type[TotalPrice]']"));
        totalPrice.sendKeys("420");

        WebElement date = driver.findElement(By.cssSelector("input[placeholder='Choose a date']"));
        date.click();

        //Select selectDate = new Select(date);
       // selectDate.selectByValue("6");

        WebElement month = driver.findElement(By.xpath("//option[@value='6']"));
        month.click();

        WebElement year = driver.findElement(By.xpath("//option[@value='2022']"));
        year.click();

        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//button[@data-handler='today']"));
        day.click();

        WebElement purchaser = driver.findElement(By.cssSelector("input[name='custom_entity_type[Purchaser]']"));
        purchaser.sendKeys("James Bond");

        WebElement invoiceReference = driver.findElement(By.cssSelector("input[name='custom_entity_type[InvoiceReference]']"));
        invoiceReference.sendKeys("Ref#34637");

        WebElement vendor = driver.findElement(By.cssSelector("input[name='custom_entity_type[Vendor]']"));
        vendor.sendKeys("Ryder System, Inc.,");

        WebElement info = driver.findElement(By.cssSelector("textarea[data-ftid='custom_entity_type_Info']"));
        info.sendKeys("Ryder specializes in fleet management, supply chain management, and dedicated transportation management.");

        WebElement saveAndCloseBtn = driver.findElement(By.cssSelector("button[class='btn btn-success action-button']"));
        saveAndCloseBtn.click();

        Thread.sleep(2000);

        WebElement additionalInfo = driver.findElement(By.linkText("Additional Information"));

        String actualUrl = driver.getCurrentUrl();


       Assert.assertTrue(actualUrl.contains("item"));


        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase13.png"));


    }

}

