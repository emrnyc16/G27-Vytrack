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
import java.util.concurrent.TimeUnit;

public class TestCase10 extends TestBase {
    @Test
    public void TestCase_10() throws InterruptedException, IOException {
        Util.loginAnyUser(driver, "User177","UserUser123");
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        WebElement butn = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        butn.click();
//        List<WebElement> table=driver.findElements(By.xpath("//tbody[@class='grid-body']//tr"));
//       System.out.println(table);
//        for (WebElement each:table) {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            each.click();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            Thread.sleep(1000);
//
//            driver.navigate().back();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }

        for (int i = 1; i < 26; i++) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//tbody[@class='grid-body'])//tr["+i+"]")).click();
            Thread.sleep(1000);
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("C:\\Users\\ermek\\Desktop\\VyTrack\\TestCase10\\data"+i+".png"));
            driver.navigate().back();
        }
    }
}
