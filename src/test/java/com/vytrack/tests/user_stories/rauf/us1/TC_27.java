package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.Driver;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import com.vytrack.tests.user_stories.rauf.util.ButtonsUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TC_27 extends TestBase {


    @Test
    public void verifyDragAndDrop() throws InterruptedException, IOException {
        LoginUtil.login();
        MenuUtil.vehicleMenu();

        Thread.sleep(2000);
        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();



        WebElement sourceDragElement = Driver.getDriver().findElement(By.xpath("(//*[@class='fa-arrows-v handle ui-sortable-handle'])[1]"));
        Thread.sleep(2000);

        WebElement targetDragElement = Driver.getDriver().findElement(By.xpath("//*[@class='renderable'][1]"));

        Actions action = new Actions(Driver.getDriver());

        //clicking and holding element with clickAndHold method and moves it to place which you want to change with moveToElement. To call methods need to create Actions obj
        action.clickAndHold(sourceDragElement).pause(Duration.ofSeconds(2)).moveToElement(targetDragElement).pause(Duration.ofSeconds(2)).release().build().perform();

        ButtonsUtil.takeScreenShot("GS_dragAndDrop.png");


    }

}
