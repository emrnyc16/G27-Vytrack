package com.vytrack.tests.user_stories.rauf.us1;

import com.vytrack.tests.user_stories.rauf.base.TestBase;
import com.vytrack.tests.user_stories.rauf.util.LoginUtil;
import com.vytrack.tests.user_stories.rauf.util.MenuUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC_26 extends TestBase {



    @Test
    public void verifyCheckboxDeSelect() throws InterruptedException, IOException {
        LoginUtil.login(driver);
        MenuUtil.vehicleMenu(driver);

        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();


        WebElement gridCheckboxSelect = driver.findElement(By.xpath("//table[@class='grid table-hover table table-condensed']//tr[2]//preceding-sibling::tr"));
        gridCheckboxSelect.click();


        Assert.assertTrue(gridCheckboxSelect.getAttribute("class").equals("renderable"));

        WebElement gridCheckboxDeSelect = driver.findElement(By.xpath("//table[@class='grid table-hover table table-condensed']//tr[2]//preceding-sibling::tr"));
        gridCheckboxDeSelect.click();

        Assert.assertTrue(gridCheckboxSelect.getAttribute("class").equals(""));

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\GS_checkboxDeSelect.png"));


    }

}
