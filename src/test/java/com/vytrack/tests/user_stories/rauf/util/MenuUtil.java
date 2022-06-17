package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuUtil {


    public static void vehicleMenu(WebDriver driver){

        WebElement fleetMenu = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetMenu.click();

        WebElement vehicleMenu = driver.findElement(By.xpath("//*[.='Vehicles']"));
        vehicleMenu.click();

    }

    public static void vehicleOdometerMenu(WebDriver driver) throws InterruptedException {

//        Actions action = new Actions(driver);
//
//        WebElement fleetMenu = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
//        action.moveToElement(fleetMenu);
//
//        WebElement odometerMenu = driver.findElement(By.partialLinkText("Vehicle Odometer"));
//
//        action.moveToElement(odometerMenu);
//        action.click().build().perform();

        WebElement fleetMenu = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetMenu.click();

        WebElement odometerMenu = driver.findElement(By.partialLinkText("Vehicle Odometer"));
        odometerMenu.click();
    }


}
