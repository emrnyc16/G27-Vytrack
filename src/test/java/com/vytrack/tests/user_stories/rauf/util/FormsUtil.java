package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormsUtil {

    public static void fillCreateOdometerForm( String odometerValue, String driverName, int month, String year, String day, String unitOption) throws InterruptedException {
        WebElement odometerValueInput = Driver.getDriver().findElement(By.xpath("//*[@name='custom_entity_type[OdometerValue]']"));
        odometerValueInput.sendKeys(odometerValue);
        Thread.sleep(2000);

        WebElement driverInput = Driver.getDriver().findElement(By.xpath("//*[@name='custom_entity_type[Driver]']"));
        driverInput.sendKeys(driverName);

        Thread.sleep(2000);

        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Choose a date']"));
        date.click();

        Thread.sleep(2000);

        WebElement monthSelect = Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthSelect);
        select.selectByIndex(month-1);
        Thread.sleep(2000);

        WebElement yearSelect = Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        select = new Select(yearSelect);
        select.selectByValue(year);
        Thread.sleep(2000);

        WebElement daySelect = Driver.getDriver().findElement(By.partialLinkText(day));
        daySelect.click();

        Thread.sleep(2000);
        WebElement unitSelect = Driver.getDriver().findElement(By.xpath("//*[@class='select2-choice']"));
        unitSelect.click();

        Thread.sleep(2000);

        //option[@value='km']
        WebElement unitOptionSelect = Driver.getDriver().findElement(By.xpath("//option[@value='"+unitOption+"']"));
        unitOptionSelect.click();

        Thread.sleep(2000);
        //*[.='Add']
        WebElement licensePlateAddBtn = Driver.getDriver().findElement(By.xpath("//*[.='Add']"));
        licensePlateAddBtn.click();

        Thread.sleep(2000);

        //*[@class='grid-body']//tr[3]
        WebElement plateSelect = Driver.getDriver().findElement(By.xpath("//*[@class='grid-body']//tr[3]"));
        plateSelect.click();
        Thread.sleep(2000);

        WebElement plateAddBtn = Driver.getDriver().findElement(By.xpath("//*[.='Select']"));
        plateAddBtn.click();

        Thread.sleep(2000);

        //*[@type='submit']
        WebElement saveBtn = Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
        saveBtn.click();


        //*[@class='message']


    }
}
