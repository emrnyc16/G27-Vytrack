package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.Driver;
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
        LoginUtil.login();
        MenuUtil.vehicleMenu();

        Thread.sleep(2000);
        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();

        Thread.sleep(2000);

        WebElement gridCheckboxSelect = Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-condensed']//tr[3]"));
        gridCheckboxSelect.click();

        Thread.sleep(2000);
        WebElement selectAllBtn = Driver.getDriver().findElement(By.partialLinkText("Select All"));


        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", selectAllBtn);


        String getTextSelectAll = selectAllBtn.getAttribute("class");
        Assert.assertTrue(getTextSelectAll.contains("disabled"));


        ButtonsUtil.takeScreenShot("GS_selectALl.png");


    }
}
