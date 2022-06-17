package com.vytrack.tests.user_stories.emrepackage.userstory_six;

import com.vytrack.tests.user_stories.emrepackage.utilities.Driver;
import com.vytrack.tests.user_stories.emrepackage.utilities.VyTrackLogIn;
import com.vytrack.tests.user_stories.emrepackage.utilities.WaitMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC6_1 {

    @Test
    public void test() throws IOException, InterruptedException {
        VyTrackLogIn.LogInStoreManager();
        Thread.sleep(3000);

        WebElement ele = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));

        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(ele);
        Thread.sleep(3000);

        WebElement vehicleCost= Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        action.moveToElement(vehicleCost);
        action.click().build().perform();
        Thread.sleep(3000);
        String actual=Driver.getDriver().findElement(By.xpath("(//h1[contains(text(),'Vehicle Costs')])")).getText();
        Assert.assertEquals(actual,"All Vehicle Costs","It is not equal");
        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\emree\\OneDrive\\Desktop\\VyTrack\\US-6\\TestCase6_1.png"));

        Driver.getDriver().findElement(By.xpath("//li[@id='user-menu']/a")).click();
        Driver.getDriver().findElement(By.xpath("//*[.='Logout']")).click();

    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}
