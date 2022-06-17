package com.vytrack.tests.user_stories.rauf.us3;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import com.vytrack.tests.user_stories.rauf.util.ButtonsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_3_4_1 extends TestBase {

    @Test
    public void checkVehicleOdometerMenu() throws InterruptedException {
        LoginUtil.login(driver);
        MenuUtil.vehicleOdometerMenu(driver);

        WebElement menuTitle = driver.findElement(By.xpath("//*[.='Vehicles Odometers']"));
        Thread.sleep(2000);

        Assert.assertTrue(menuTitle.getText().equals("Vehicles Odometers"));

    }

    @Test (dependsOnMethods = "checkVehicleOdometerMenu")
    public void checkCreateOdometerBtn() throws InterruptedException, IOException {
        Thread.sleep(2000);
        ButtonsUtil.createOdometerBtn(driver);
        Thread.sleep(2000);

        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa2.vytrack.com/entity/update/Extend_Entity_VehiclesOdometer/item"));


    }
    @Test (dependsOnMethods = "checkCreateOdometerBtn")
    public void checkCreatingOdometer() throws InterruptedException, IOException {

        ButtonsUtil.createOdometer(driver,"2020","Rauf",12,"2022","6","km");
        WebElement message = driver.findElement(By.xpath("//*[@class='message']"));
        Assert.assertTrue(message.getText().equals("Entity saved"));

    }



}
