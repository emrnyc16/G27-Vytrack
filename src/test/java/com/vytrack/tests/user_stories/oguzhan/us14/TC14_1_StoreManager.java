package com.vytrack.tests.user_stories.oguzhan.us14;

import com.vytrack.tests.user_stories.oguzhan.base.TestBase;
import com.vytrack.tests.user_stories.oguzhan.utility.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TC14_1_StoreManager extends TestBase {

    @Test
    public void loginStoreManager() throws InterruptedException {
        Login.login_Vytrack(driver, "storemanager210", "UserUser123");
        WebElement fleetModule = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]"));
       fleetModule.click();

       WebElement vehiclesModel = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
       vehiclesModel.click();

       WebElement allVehiclesModel = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
       allVehiclesModel.isDisplayed();

        Thread.sleep(5000);


    }
//    @Test
//    public void loginSalesManager() throws InterruptedException {
//        Login.login_Vytrack(driver, "salesmanager274 ", "UserUser123");
//        WebElement fleetModule = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]"));
//        fleetModule.click();
//
//        WebElement vehiclesModel = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
//        vehiclesModel.click();
//
//        WebElement allVehiclesModel = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
//        allVehiclesModel.isDisplayed();
//
//        Thread.sleep(5000);
//
//    }
}
