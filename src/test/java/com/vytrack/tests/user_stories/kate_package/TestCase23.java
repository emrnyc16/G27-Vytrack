package com.vytrack.tests.user_stories.kate_package;

import com.vytrack.tests.user_stories.kate_package.test_base.TestBase;
import com.vytrack.tests.user_stories.kate_package.utilities.VytrackLogin;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestCase23 extends TestBase {
    // Check if truck driver is able to see the Grid setting button

    @Test
    public void vytrack_GridBtn() throws IOException, InterruptedException {

        // 1. Goes to vytrack login page:
        driver.get("https://qa2.vytrack.com/user/login");

        // enters username and password, then clicks on Login button:
        VytrackLogin.vytrack_login(driver, "user177", "UserUser123");
        Thread.sleep(3000);

        // Click on Fleet module
        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetModule.click();
        Thread.sleep(3000);

        // Click on Vehicles feature
        WebElement vehicles = driver.findElement(By.xpath("//span[@class='title title-level-2'][1]"));
        vehicles.click();
        Thread.sleep(3000);

        // 2. Locating the Grid button:

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Grid Settings']")));

        WebElement gridBtn= driver.findElement(By.xpath("//a[@title='Grid Settings']"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(gridBtn).build().perform();
        Thread.sleep(3000);

        // 3. Verify if the title of the Grid button is "Grid Settings"
        String actualGridBtnTitle = gridBtn.getAttribute("title");
        System.out.println("actualGridBtnTitle = " + actualGridBtnTitle);

        String expectedGridBtnTitle = "Grid Settings";
        System.out.println("expectedGridBtnTitle = " + expectedGridBtnTitle);

        Assert.assertEquals(actualGridBtnTitle, expectedGridBtnTitle, "The button title is incorrect!");

        // 4. Take a screenshot:
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\Users\\kolib\\Desktop\\Vytrack\\TC23_Positive.png"));


    }

}
