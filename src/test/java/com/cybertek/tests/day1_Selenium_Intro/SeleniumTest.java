package com.cybertek.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // 1 - set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of chrome driver
        // this is the line where the Selenium WebDriver opens the browser
        WebDriver driver = new ChromeDriver();

        //this line maximizes the browser
        driver.manage().window().maximize();

        // 3 - test if driver is working
        driver.get("https://www.google.com");

        System.out.println("Current title of the page: " + driver.getTitle());

        //getting the current URL and storing it into a String
        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        //we are using navigate.back method from SELENIUM LIBRARY
        Thread.sleep(3000);

        //goes to back
        driver.navigate().back();

        Thread.sleep(3000);

        //goes to forward
        driver.navigate().forward();

        Thread.sleep(3000);

        //this is similar to get method. it gets the given URL.
        driver.navigate().to("https://www.tesla.com");

        System.out.println("Current title of the page: " + driver.getTitle());

        //we are refreshing(re-assigning) the value of "currentUrl" String by calling the method again
        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        // closing the browser
        driver.close();



    }
}
