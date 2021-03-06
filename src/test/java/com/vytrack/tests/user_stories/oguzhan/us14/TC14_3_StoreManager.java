package com.vytrack.tests.user_stories.oguzhan.us14;

import com.vytrack.tests.user_stories.oguzhan.base.TestBase;
import com.vytrack.tests.user_stories.oguzhan.utility.Login;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TC14_3_StoreManager extends TestBase {

    @Test
    public void loginStoreManager() throws InterruptedException, IOException {
        Login.login_Vytrack(driver, "storemanager210", "UserUser123");
        WebElement fleetModule = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]"));
        fleetModule.click();

        WebElement vehiclesModel = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
        vehiclesModel.click();

        WebElement createVehicleModel = driver.findElement(By.xpath("//a[@title='Create Vehicles Model']"));
        createVehicleModel.click();

        WebElement fuelType = driver.findElement(By.xpath("(//span[@class='select2-chosen'])[2]"));
        fuelType.click();

        List<WebElement> fuelTypeList = driver.findElements(By.className("select2-result-label"));
        for (WebElement each : fuelTypeList) {
            System.out.println("each.getText() = " + each.getText() + " is displayed: " + each.isDisplayed());

            Thread.sleep(3000);

            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("C:\\Users\\aydog\\Downloads\\VyTrack Store Manager\\ScreenShot.png"));


        }

    }
}