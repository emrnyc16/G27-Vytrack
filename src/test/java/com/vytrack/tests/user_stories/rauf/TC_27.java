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

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_27 extends TestBase {


    @Test
    public void verifyDragAndDrop() throws InterruptedException, IOException {
        LoginUtil.loginAnyUser(driver);
        MenuUtil.vehicleMenu(driver);

        Thread.sleep(2000);
        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();



        WebElement sourceDragElement = driver.findElement(By.xpath("(//*[@class='fa-arrows-v handle ui-sortable-handle'])[1]"));
        Thread.sleep(2000);

        WebElement targetDragElement = driver.findElement(By.xpath("//*[@class='renderable'][1]"));

        Actions action = new Actions(driver);

        //clicking and holding element with clickAndHold method and moves it to place which you want to change with moveToElement. To call methods need to create Actions obj
        action.clickAndHold(sourceDragElement).pause(Duration.ofSeconds(2)).moveToElement(targetDragElement).pause(Duration.ofSeconds(2)).release().build().perform();

        OtherUtils.takeScreenShot(driver,"GS_dragAndDrop.png");


    }

}
