package com.vytrack.tests.user_stories.emrepackage.utilities;

import org.openqa.selenium.By;

public class VyTrackLogIn {

    public  static void LogInStoreManager(){
       Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
       Driver.getDriver().findElement(By.xpath("//input[@name='_username']")) .sendKeys(ConfigurationReader.getProperty("storeManagerUser210"));
       Driver.getDriver().findElement(By.xpath("//input[@*='password']")) .sendKeys(ConfigurationReader.getProperty("password"));
       Driver.getDriver().findElement(By.xpath("//button[.='Log in']")).click();
    }

    public  static void LogInSalesManager(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        Driver.getDriver().findElement(By.xpath("//input[@name='_username']")) .sendKeys(ConfigurationReader.getProperty("salesManagerUser273"));
        Driver.getDriver().findElement(By.xpath("//input[@*='password']")) .sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.xpath("//button[.='Log in']")).click();
    }
}
