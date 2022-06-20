package com.vytrack.tests.user_stories.rauf.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class ButtonsUtil {

    public static void takeScreenShot( String screenShotName) throws IOException {

        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\"+screenShotName));
    }

    public static void gridSettingButton(){

        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();
    }

    public static void clickOdometerBtn(){

        WebElement createBtn = Driver.getDriver().findElement(By.partialLinkText("Create Vehicle Odometer"));
        createBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa2.vytrack.com/entity/update/Extend_Entity_VehiclesOdometer/item"));
    }


}
