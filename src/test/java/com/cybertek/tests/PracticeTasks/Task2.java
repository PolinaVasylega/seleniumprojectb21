package com.cybertek.tests.PracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("username");

        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("password");

        // Click “Log In” button
        driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();

        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook”
        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.err.println("Title verification FAILED!!!");
        }
        driver.close();



    }
}
