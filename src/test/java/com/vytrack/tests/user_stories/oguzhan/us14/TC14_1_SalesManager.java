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

public class TC14_1_SalesManager extends TestBase {

    @Test
    public void loginSalesManager() throws InterruptedException, IOException {
        Login.login_Vytrack(driver, "salesmanager274", "UserUser123");
        WebElement fleetModule = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]"));
        fleetModule.click();

        WebElement vehiclesModel = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
        vehiclesModel.click();

        WebElement allVehiclesModel = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
        allVehiclesModel.isDisplayed();

        Thread.sleep(3000);

        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\Users\\aydog\\Downloads\\VyTrack Sales Manager\\ScreenShot.png"));




    }
}


