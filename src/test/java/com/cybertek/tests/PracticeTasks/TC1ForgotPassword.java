package com.cybertek.tests.PracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC1ForgotPassword {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));

        // b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // c. “E-mail” text
        WebElement email = driver.findElement(By.xpath("//label[.='E-mail']"));

        // d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        // e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f. “Powered byCybertek School” text
        WebElement poweredByCybertekSchool = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        if(home.isDisplayed() && forgotPassword.isDisplayed() && email.isDisplayed() &&
                inputBox.isDisplayed() && retrievePassword.isDisplayed() &&
                poweredByCybertekSchool.isDisplayed()){
            System.out.println("All WebElements are displayed!!!");
        }else{
            System.out.println("All WebElements are NOT displayed!");
        }

        driver.close();










    }

}
