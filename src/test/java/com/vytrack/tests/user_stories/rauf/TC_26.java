package com.vytrack.tests.user_stories.rauf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_26 {


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
    public void verifyCheckboxDeSelect() throws InterruptedException, IOException {

        WebElement fleetModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetModule.click();

        WebElement vehicleMenu = driver.findElement(By.xpath("//*[.='Vehicles']"));
        vehicleMenu.click();

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
