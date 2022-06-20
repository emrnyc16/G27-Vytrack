package com.vytrack.tests.user_stories.rauf.us3;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TC_3_4_1 {

    @Test
    public void checkVehicleOdometerMenu() throws InterruptedException {
        LoginUtil.login();
        MenuUtil.vehicleOdometerMenu();

        WebElement menuTitle = Driver.getDriver().findElement(By.xpath("//*[.='Vehicles Odometers']"));
        Thread.sleep(2000);

        Assert.assertTrue(menuTitle.getText().equals("Vehicles Odometers"));


    }

    @Test (dependsOnMethods = "checkVehicleOdometerMenu")
    public void checkCreateOdometerBtn() throws InterruptedException, IOException {
        Thread.sleep(2000);
        ButtonsUtil.clickOdometerBtn();
        Thread.sleep(2000);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa2.vytrack.com/entity/update/Extend_Entity_VehiclesOdometer/item"));


    }
    @Test (dependsOnMethods = "checkCreateOdometerBtn")
    public void checkCreatingOdometer() throws InterruptedException, IOException {

        FormsUtil.fillCreateOdometerForm("2020","Rauf",12,"2022","6","km");
        WebElement message = Driver.getDriver().findElement(By.xpath("//*[@class='message']"));
        Driver.closeDriver();
        Assert.assertTrue(message.getText().equals("Entity saved"));



    }



}
