package com.vytrack.tests.user_stories.rauf;

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

public class TC_27 {

    public WebDriver driver;
    @BeforeMethod
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userName=driver.findElement(By.xpath("//input[@name='_username']"));
        userName.sendKeys("user177");
        WebElement password= driver.findElement(By.xpath("//input[@*='password']"));
        password.sendKeys("UserUser123");

        WebElement login= driver.findElement(By.xpath("//button[.='Log in']"));
        login.click();
    }
//    @AfterMethod
//    public  void tearDown(){
//        driver.quit();
//    }

    @Test
    public void verifyDragAndDrop() throws InterruptedException, IOException {

        WebElement fleetModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetModule.click();

        WebElement vehicleMenu = driver.findElement(By.xpath("//*[.='Vehicles']"));
        vehicleMenu.click();

        Thread.sleep(2000);
        WebElement settingBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settingBtn.click();


        Thread.sleep(2000);

        WebElement sourceDragElement = driver.findElement(By.xpath("(//*[@class='fa-arrows-v handle ui-sortable-handle'])[1]"));
        Thread.sleep(2000);

        WebElement targetDragElement = driver.findElement(By.xpath("//*[@class='renderable'][1]"));

        Actions action = new Actions(driver);
//        action.dragAndDrop(sourceDragElement,targetDragElement).perform();

        action.clickAndHold(sourceDragElement).pause(Duration.ofSeconds(2)).moveToElement(targetDragElement).pause(Duration.ofSeconds(2)).release().build().perform();


        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\raliyev\\Desktop\\Cydeo\\Screenshots\\GS_dragAndDrop.png"));


    }

}
