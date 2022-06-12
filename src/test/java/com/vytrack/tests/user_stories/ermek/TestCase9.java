package com.vytrack.tests.user_stories.ermek;

import com.vytrack.tests.user_stories.ermek.base.TestBase;
import com.vytrack.tests.user_stories.ermek.util.Util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase9 extends TestBase {
    @Test
    public void TestCase09() throws IOException, InterruptedException {


        Util.loginAnyUser(driver, "User177","UserUser123");
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        WebElement butn=driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        butn.click();
        Thread.sleep(2000);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\ermek\\Desktop\\VyTrack\\TestCase09.png"));
    }
}
