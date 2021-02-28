package com.cybertek.tests.PracticeTasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class AppleFindElements02 {
    public static void main(String[] args) {

        //  #03: FINDELEMENTS_APPLE
        //  1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //  2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();

        //  3.Click to all of the headers one by one
        //  a.Mac, iPad, iPhone, Watch, TV, Music, Support
       // List<WebElement> headwrs =


        //  4.Printout how many links on each pagewiththe titles of the pages

        //  5.Loop through all

        //  6.Print out how many link is missing textTOTAL

        //  7.Print out how many link has textTOTAL

        //  8.Print out how many total linkTOTAL

    }
}