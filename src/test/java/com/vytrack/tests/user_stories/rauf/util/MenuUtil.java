package com.vytrack.tests.user_stories.rauf.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuUtil {


    public static void vehicleMenu(WebDriver driver){

        WebElement fleetModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetModule.click();

        WebElement vehicleMenu = driver.findElement(By.xpath("//*[.='Vehicles']"));
        vehicleMenu.click();

    }
}
