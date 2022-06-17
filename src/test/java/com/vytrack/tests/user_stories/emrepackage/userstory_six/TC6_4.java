package com.vytrack.tests.user_stories.emrepackage.userstory_six;

import com.vytrack.tests.user_stories.emrepackage.utilities.Driver;
import com.vytrack.tests.user_stories.emrepackage.utilities.VyTrackLogIn;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TC6_4 {

    @Test
    public void test() throws InterruptedException, IOException {
        VyTrackLogIn.LogInStoreManager();
        Thread.sleep(3000);

        WebElement ele = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(ele);
        Thread.sleep(3000);

        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        action.moveToElement(vehicleCost);
        action.click().build().perform();
        Thread.sleep(5000);

        Driver.getDriver().findElement(By.xpath("//div[@class='pull-right title-buttons-container']/a")).click();
        Thread.sleep(3000);

        Driver.getDriver().findElement(By.xpath("//span[.='Choose a value...']")).click();
        Driver.getDriver().findElement(By.xpath("//div[.='Repair and maintenance']")).click();
        WebElement price=Driver.getDriver().findElement(By.xpath("//input[@data-name='field__total-price']"));
        price.click();
        price.sendKeys("250.00");
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Choose a date']")).click();

        Select month = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-handler='selectMonth']")));
        month.selectByValue("2");

        Select year = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-handler='selectYear']")));
        year.selectByVisibleText("2023");

        Driver.getDriver().findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[2]//td[6]")).click();
        Driver.getDriver().findElement(By.xpath("//textarea[contains(@id,'custom_entity_type_')]")).sendKeys("Repair has been made by Oscar");

        Driver.getDriver().findElement(By.xpath("(//i[@class='fa-plus'])[1]")).click();
        Thread.sleep(3000);

        Driver.getDriver().findElement(By.xpath("(//input[@tabindex='-1'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("//button[@data-action-name='select']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//input[@class='default-selector']")).click();
        Driver.getDriver().findElement(By.xpath("(//i[@class='fa-plus'])[2]")).click();
        Thread.sleep(3000);

        Driver.getDriver().findElement(By.xpath("//table[contains(@class,'grid table-hover')]//tbody//tr[7]//td[1]//input")).click();

        Driver.getDriver().findElement(By.xpath("(//span[@class='action-wrapper'])[2]//button")).click();

        Driver.getDriver().findElement(By.xpath("//input[contains(@name,'custom_entity_type_License_Plate')]")).click();

        Thread.sleep(3000);
       Driver.getDriver().findElement(By.xpath("//a[@title='Cancel']")).click();

        Thread.sleep(3000);
        File src = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\emree\\OneDrive\\Desktop\\VyTrack\\US-6\\TestCase6_4.png"));

        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//li[@id='user-menu']/a")).click();
        Driver.getDriver().findElement(By.xpath("//*[.='Logout']")).click();
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}

