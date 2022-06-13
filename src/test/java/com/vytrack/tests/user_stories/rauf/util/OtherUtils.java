package com.vytrack.tests.user_stories.rauf.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class OtherUtils {

    public static void takeScreenShot(WebDriver driver, String screenShotName) throws IOException {

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\"+screenShotName));
    }

    public static void gridSettingButton(WebDriver driver){

        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();
    }
}
