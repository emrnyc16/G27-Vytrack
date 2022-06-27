package com.vytrack.tests.user_stories.maxim;

import com.sun.jdi.connect.Connector;
import com.vytrack.tests.user_stories.emrepackage.utilities.WebDriverFactory;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase09 extends TestBase {

   // 9. Check if truck driver is able to see vehicles table in order that was configured in Grid settings


    @Test
    public void confirmAllSelected() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user177");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        WebElement fleetClass = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetClass.click();

        WebElement vehiclesClass = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        vehiclesClass.click();

        // 3. Given I am on the "Grid Settings" window, click on the "Grid Settings" button
        // WebElement gridSettingsBtn = driver.findElement()

        Thread.sleep(2000);

        WebElement gridSettingsBtn = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        gridSettingsBtn.click();

        // 4. When I deselect numerous options starting from the bottom
        //    Then, only the selected options appear in selected order in main Cars Grid window

        WebElement horsePowerTaxation = driver.findElement(By.id("column-c128"));
        if(horsePowerTaxation.isSelected()){horsePowerTaxation.click();}

        WebElement horsePower = driver.findElement(By.id("column-c127"));
        if (horsePower.isSelected()){horsePower.click();}

        WebElement co2Emissions = driver.findElement(By.id("column-c126"));
        if (co2Emissions.isSelected()){co2Emissions.click();}

        WebElement fuelType = driver.findElement(By.id("column-c125"));
        if(fuelType.isSelected()){fuelType.click();}

        WebElement transmission = driver.findElement(By.id("column-c124"));
        if(transmission.isSelected()){transmission.click();}

        WebElement color = driver.findElement(By.id("column-c123"));
        if (color.isSelected()){ color.click();}

        WebElement doorNumber = driver.findElement(By.id("column-c122"));
        if (doorNumber.isSelected()){doorNumber.click();}

        WebElement seatNumber = driver.findElement(By.id("column-c121"));
        if (seatNumber.isSelected()){seatNumber.click();}

        WebElement catalogValue = driver.findElement(By.id("column-c120"));
        if (catalogValue.isSelected()){catalogValue.click();}

        WebElement firstContractDate = driver.findElement(By.id("column-c119"));
        if (firstContractDate.isSelected()){firstContractDate.click();}

        WebElement immatriculationDate = driver.findElement(By.id("column-c118"));
        if(immatriculationDate.isSelected()){immatriculationDate.click();}

        WebElement lastOdometer = driver.findElement(By.id("column-c117"));
        if (lastOdometer.isSelected()){lastOdometer.click();}

        WebElement powerKW = driver.findElement(By.id("column-c129"));
        if (powerKW.isSelected()){powerKW.click();}

        WebElement id = driver.findElement(By.id("column-c110"));
        if(id.isSelected()){System.out.println("The id already selected!");}else {id.click();}



        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase09.png"));






    }


}
