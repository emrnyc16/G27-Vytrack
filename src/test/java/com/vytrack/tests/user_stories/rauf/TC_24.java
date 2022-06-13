package com.vytrack.tests.user_stories.rauf;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC_24 extends TestBase {



    @Test
    public void clickGridSettingButton() throws InterruptedException, IOException {
        LoginUtil.loginAnyUser(driver);
        MenuUtil.vehicleMenu(driver);


        Thread.sleep(2000);
        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();

        WebElement gridSettingModal = driver.findElement(By.xpath("//*[.='Grid Settings']"));
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\Grid_Setting.png"));
        Assert.assertTrue(gridSettingModal.getText().equals("Grid Settings"));

    }

}
