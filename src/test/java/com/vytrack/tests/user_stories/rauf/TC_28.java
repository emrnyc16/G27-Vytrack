package com.vytrack.tests.user_stories.rauf;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import com.vytrack.tests.user_stories.rauf.util.OtherUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_28 extends TestBase {


    @Test
    public void verifySelectAllBtn() throws InterruptedException, IOException {
        LoginUtil.loginAnyUser(driver);
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


        OtherUtils.takeScreenShot(driver,"GS_selectALl.png");


    }
}
