package com.vytrack.tests.user_stories.rauf.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class ButtonsUtil {

    public static void takeScreenShot(WebDriver driver, String screenShotName) throws IOException {

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\"+screenShotName));
    }

    public static void gridSettingButton(WebDriver driver){

        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();
    }

    public static void createOdometerBtn(WebDriver driver){

        WebElement createBtn = driver.findElement(By.partialLinkText("Create Vehicle Odometer"));
        createBtn.click();
    }

    public static void createOdometer(WebDriver driver,String odometerValue,String driverName, int month, String year, String day,String unitOption) throws InterruptedException {
        WebElement odometerValueInput = driver.findElement(By.xpath("//*[@name='custom_entity_type[OdometerValue]']"));
        odometerValueInput.sendKeys(odometerValue);
        Thread.sleep(2000);

        WebElement driverInput = driver.findElement(By.xpath("//*[@name='custom_entity_type[Driver]']"));
        driverInput.sendKeys(driverName);

        Thread.sleep(2000);

        WebElement date = driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        date.click();

        Thread.sleep(2000);

        WebElement monthSelect = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthSelect);
        select.selectByIndex(month-1);
        Thread.sleep(2000);

        WebElement yearSelect = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        select = new Select(yearSelect);
        select.selectByValue(year);
        Thread.sleep(2000);

        WebElement daySelect = driver.findElement(By.partialLinkText(day));
        daySelect.click();

        Thread.sleep(2000);
        WebElement unitSelect = driver.findElement(By.xpath("//*[@class='select2-choice']"));
        unitSelect.click();

        Thread.sleep(2000);

        //option[@value='km']
        WebElement unitOptionSelect = driver.findElement(By.xpath("//option[@value='"+unitOption+"']"));
        unitOptionSelect.click();

    Thread.sleep(2000);
        //*[.='Add']
        WebElement licensePlateAddBtn = driver.findElement(By.xpath("//*[.='Add']"));
        licensePlateAddBtn.click();

        Thread.sleep(2000);

        //*[@class='grid-body']//tr[3]
        WebElement plateSelect = driver.findElement(By.xpath("//*[@class='grid-body']//tr[3]"));
        plateSelect.click();
        Thread.sleep(2000);

        WebElement plateAddBtn = driver.findElement(By.xpath("//*[.='Select']"));
        plateAddBtn.click();

        Thread.sleep(2000);

        //*[@type='submit']
        WebElement saveBtn = driver.findElement(By.xpath("//*[@type='submit']"));
        saveBtn.click();


        //*[@class='message']


    }
}
