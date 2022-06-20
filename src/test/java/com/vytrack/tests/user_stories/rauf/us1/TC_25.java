package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.Driver;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC_25 extends TestBase {



    @Test
    public void verifyCheckboxSelect() throws InterruptedException, IOException {
        LoginUtil.login();
        MenuUtil.vehicleMenu();

        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();

        Thread.sleep(3000);

        WebElement gridCheckboxSelect = Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-condensed']//tr[2]//preceding-sibling::tr"));
        gridCheckboxSelect.click();

        System.out.println(gridCheckboxSelect.getAttribute("class"));

        Assert.assertTrue(gridCheckboxSelect.getAttribute("class").equals("renderable"));

        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\GS_checkbox.png"));


    }

}
