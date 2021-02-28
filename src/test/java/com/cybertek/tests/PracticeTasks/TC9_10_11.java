package com.cybertek.tests.PracticeTasks;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC9_10_11 {
    //TC #9: SmartBear delete order
    // 1.Open browser and login to SmartBear
    // 2.Delete “Mark Smith” from the list
    // 3.Assert it is deleted from the list
    WebDriver driver;

    @BeforeMethod
    public void setUpDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebOrderUtils.loginToSmartBear(driver);
    }

    @Test
    public void delete() {
        WebElement checkButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        checkButton.click();
        WebElement deleteButton = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$btnDelete']"));
        deleteButton.click();
        WebElement name = driver.findElement(By.xpath("//tr[3]/td[2]"));
        String  actualResult = name.getText();
        String expectedResult = "Mark Smith";

        Assert.assertTrue(!expectedResult.equals(actualResult));

    }

    // TC #10: SmartBear edit order
    // 1.Open browser and login to SmartBear
    // 2.Click to edit button from the right for “Steve Johns”
    // 3.Change name to “Michael Jordan”
    // 4.Click Update
    // 5.Assert “Michael Jordan” is in the listTC

    @Test
    public void editOrder(){
       // WebElement editButton = driver.findElement()
    }







    // #11: Create a method called removeName()
    // 1.Accepts two parameters: WebDriver, String name
    // 2.Method will remove the given name from the list of Smartbear
    // 3.Create a new TestNG test, and call your method.
    //4.Assert that your method removed the given name


}
