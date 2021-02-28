package com.cybertek.tests.PracticeTasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();
        Thread.sleep(2000);

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement delete = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (delete.isDisplayed()) {
            System.out.println("“Delete” button is displayed after clicking!!!");
        } else {
            System.out.println("“Delete” button is NOT displayed after clicking!");
        }

        // 5. Click to “Delete” button.
        // 6. Verify “Delete” button is NOT displayed after clicking.

        try {
            delete.click();
            if (!delete.isDisplayed()) {
                System.out.println("“Delete” button is NOT displayed after clicking! PASS!");
            } else {
                System.out.println("“Delete” button is displayed after clicking! FAILED!");
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementException has been thrown.");
            System.out.println("It means element has been completely deleted from the HTML.");
            System.out.println("Delete button is not displayed. Verification PASSED!");
        }


        driver.close();

    }
}