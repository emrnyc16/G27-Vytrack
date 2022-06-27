package com.vytrack.tests.user_stories.maxim;
import com.vytrack.tests.user_stories.maxim.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
public class TestCase10 extends TestBase {

    //  7. As an authorized user I can "Create Vehicle Contract" event

    @Test
    public void confirmAllSelected() throws InterruptedException, IOException {

//     2. Go to website: https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("storemanager210");

        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        Thread.sleep(2000);

        WebElement fleetClass = driver.findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]"));
        fleetClass.click();

        Thread.sleep(3000);

        WebElement vehiclesContractsClass = driver.findElement(By.linkText("Vehicle Contracts"));
        vehiclesContractsClass.click();


        WebElement createVehicleContract = driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createVehicleContract.click();

        Thread.sleep(3000);


        ///-------------

        WebElement selectType = driver.findElement(By.xpath("//span[.='Choose a value...']"));
        selectType.click();

        //Select selectObj = new Select(selectType);
        //selectObj.getFirstSelectedOption();

        WebElement selectPersonalLoan = driver.findElement(By.xpath(("//div[.='Personal Loan']")));
        selectPersonalLoan.click();


       //WebElement selectPersonalLoan = driver.findElement(By.linkText("Personal Loan"));
       //selectPersonalLoan.click();

       //-----------------



        Thread.sleep(3000);

        WebElement responsible = driver.findElement(By.xpath("//input[@name='custom_entity_type[Responsible]']"));
        responsible.sendKeys("James Bond");

        Thread.sleep(1000);

        WebElement activationCost = driver.findElement(By.xpath("//input[@name='custom_entity_type[ActivationCost]']"));
        activationCost.sendKeys("45");

        Thread.sleep(3000);

        WebElement recurringCostAmountDep = driver.findElement(By.xpath("//input[@name='custom_entity_type[RecurringCostAmount]']"));
        recurringCostAmountDep.sendKeys("50");

        WebElement recurringCostAmountBtn = driver.findElement(By.xpath("//div[@class='select2-drop-mask']"));
        recurringCostAmountBtn.click();

        Thread.sleep(3000);

        WebElement dailyBtn = driver.findElement(By.xpath("//option[@value='daily']"));
        dailyBtn.click();

        Thread.sleep(3000);

        WebElement odometerDetails = driver.findElement(By.xpath("//input[@data-name='field__odometer-details']"));
        odometerDetails.sendKeys("50000");

        WebElement invoiceDate = driver.findElement(By.xpath("//input[@data-validation='{\"Date\":{}}']"));
        invoiceDate.click();

        WebElement monthBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        monthBtn.click();

        WebElement selectMonth = driver.findElement(By.xpath("//option[@value='7']"));
        selectMonth.click();

        WebElement yearBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        yearBtn.click();

        WebElement selectYear = driver.findElement(By.xpath("//option[@value='2023']"));
        selectYear.click();

        WebElement dayBtn = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
        dayBtn.click();

        WebElement year = driver.findElement(By.xpath("//option[@selected='selected']"));
        year.click();

        Thread.sleep(3000);

        WebElement contractStartDay = driver.findElement(By.xpath("(//input[@placeholder='Choose a date'])[2]"));
        contractStartDay.click();

        WebElement selectStartMonthWindow = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        selectStartMonthWindow.click();

        WebElement selectMonthStart = driver.findElement(By.xpath("//option[@value='1']"));
        selectMonthStart.click();

        WebElement selectYearStartContract = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectYearStartContract.click();

        WebElement selectDayStartContract = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
        selectDayStartContract.click();


        Thread.sleep(3000);

        WebElement selectContractWindowExp = driver.findElement(By.xpath("(//input[@placeholder='Choose a date'])[3]"));
        selectContractWindowExp.click();

        WebElement selectMonthExp = driver.findElement(By.xpath("//option[@value='0']"));
        selectMonthExp.click();

        WebElement selectYearExp = driver.findElement(By.xpath("(//select[@data-event='change'])[2]"));
        selectYearExp.click();

        Thread.sleep(3000);

        WebElement selectDayExp = driver.findElement(By.xpath("(//a[@href='#'])[29]"));
        selectDayExp.click();


        WebElement vendor = driver.findElement(By.xpath("//input[@name='custom_entity_type[Vendor]']"));
        vendor.sendKeys("Ryder");

        Thread.sleep(2000);

        WebElement driverWindow = driver.findElement(By.xpath("//input[@data-name='field__driver']"));
        driverWindow.sendKeys("James Bond");

        WebElement contractReference = driver.findElement(By.xpath("//input[@name='custom_entity_type[ContractReference]']"));
        contractReference.sendKeys("Ref#2022");

        WebElement termsAndConditions = driver.findElement(By.xpath("//textarea[@data-name='field__termsand-conditions']"));
        termsAndConditions.sendKeys("The driver must agree and abide by the terms and conditions of this agreement");

        WebElement status = driver.findElement(By.linkText("Active"));
        //status.click();

        Thread.sleep(2000);

        WebElement saveAndCloseBnt = driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        saveAndCloseBnt.click();

        Thread.sleep(3000);

        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\maxim\\IdeaProjects\\G27-Vytrack1\\TestCase10.png"));


    }
}
