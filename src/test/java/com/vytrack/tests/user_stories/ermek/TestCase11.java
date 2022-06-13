package com.vytrack.tests.user_stories.ermek;

import com.vytrack.tests.user_stories.ermek.base.TestBase;
import com.vytrack.tests.user_stories.ermek.util.Util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase11 extends TestBase {
    @Test
    public void TestCase_11() throws IOException, InterruptedException {
        Util.loginAnyUser(driver, "User177","UserUser123");
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        WebElement butn=driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        butn.click();
        // WebElement table=driver.findElement(By.xpath("//tbody[@class='grid-body']"));
        // driver.findElement(By.xpath("//tbody"))
        driver.findElement(By.xpath("(//tbody[@class='grid-body'])//tr[3]")).click();
        Thread.sleep(1000);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\ermek\\Desktop\\VyTrack\\TestCase11.png"));
    }
}
