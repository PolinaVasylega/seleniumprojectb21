package com.cybertek.tests.PracticeTasks;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC41_WaitUntil {

    // TC#41: Dynamically Loaded Page Elements 1

    @Test
    public void waitUntil(){

        // 1.Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamicLoadingURL"));
        DynamicLoad1Page dynamicallyLoadedPage = new DynamicLoad1Page();

        // 2.Click to start
        dynamicallyLoadedPage.startButton.click();

        // 3.Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage.username));

        // 4.Assert username input box is displayed
        String expectedInputBox = "input";
        String actualInputBox = dynamicallyLoadedPage.username.getTagName();
        Assert.assertTrue(actualInputBox.contains(expectedInputBox), "Assert username input box is not displayed");

        // 5.Enter username: tom smith
        dynamicallyLoadedPage.username.sendKeys("tomsmith");

        // 6.Enter password: incorrect password
        dynamicallyLoadedPage.password.sendKeys("incorrectpassword");

        // 7.Click to Submit button
        dynamicallyLoadedPage.submitButton.click();

        // 8.Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicallyLoadedPage.invalidMessage.isDisplayed(), "Your password is invalid!");

        // Note: Follow POMDesign Patter
    }



}
