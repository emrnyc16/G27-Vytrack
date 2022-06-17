package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import com.vytrack.tests.user_stories.rauf.util.ButtonsUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC_24 extends TestBase {



    @Test
    public void clickGridSettingButton() throws InterruptedException, IOException {
        LoginUtil.login(driver);
        MenuUtil.vehicleMenu(driver);


        Thread.sleep(2000);
        ButtonsUtil.gridSettingButton(driver);

        WebElement gridSettingModal = driver.findElement(By.xpath("//*[.='Grid Settings']"));
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\Grid_Setting.png"));
        Assert.assertTrue(gridSettingModal.getText().equals("Grid Settings"));

    }

}
