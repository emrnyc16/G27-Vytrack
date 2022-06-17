package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import com.vytrack.tests.user_stories.rauf.util.ButtonsUtil;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_28 extends TestBase {


    @Test
    public void verifySelectAllBtn() throws InterruptedException, IOException {
        LoginUtil.login(driver);
        MenuUtil.vehicleMenu(driver);

        Thread.sleep(2000);
        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();

        Thread.sleep(2000);

        WebElement gridCheckboxSelect = driver.findElement(By.xpath("//table[@class='grid table-hover table table-condensed']//tr[3]"));
        gridCheckboxSelect.click();

        Thread.sleep(2000);
        WebElement selectAllBtn = driver.findElement(By.partialLinkText("Select All"));


        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", selectAllBtn);


        String getTextSelectAll = selectAllBtn.getAttribute("class");
        Assert.assertTrue(getTextSelectAll.contains("disabled"));


        ButtonsUtil.takeScreenShot(driver,"GS_selectALl.png");


    }
}
