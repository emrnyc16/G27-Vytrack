package com.vytrack.tests.user_stories.emrepackage.userstory_one;

import com.vytrack.tests.user_stories.emrepackage.utilities.TestBaseTruckDriver;
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

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TC12 extends TestBaseTruckDriver {

    @Test
    public void test() throws IOException{
// TC12=Check if truck driver is able to click "Add Event button and opens a pop-up page
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Fleet')]"));

//Creating object of an Actions class
        Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
        action.moveToElement(ele);

// Locating the element from Sub Menu
        WebElement subMenu = driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']//span"));

//To mouseover on sub menu
        action.moveToElement(subMenu);

//build()- used to compile all the actions into a single step
        action.click().build().perform();

// clicking on one license plate number at first row 654321
        WebElement plateNumber= driver.findElement(By.xpath("(//*[text()='654321'])[1]"));
        plateNumber.click();

// clicking on the Add Event button
        WebElement addEvent = driver.findElement(By.xpath("//a[@title='Add an event to this record']"));
        addEvent.click();

// Finding Title area and sending " B26-G27 " then verifying if it's displayed

        WebElement title=driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        title.sendKeys("B26-G27");
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\emree\\OneDrive\\Desktop\\VyTrack\\TestCase12.png"));
        Assert.assertTrue(title.isDisplayed(),"It is not displayed");


    }
}
