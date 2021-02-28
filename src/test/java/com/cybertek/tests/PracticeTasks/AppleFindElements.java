package com.cybertek.tests.PracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppleFindElements {
    public static void main(String[] args) {

        //  TC #02: FINDELEMENTS_APPLE
        //  1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //  3.Click to iPhone
        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //  4.Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body/a"));

        //  5.Print out how many link is missing text
        //  6.Print out how many link has text
        int linksWithoutText = 0;
        int linksWithText = 0;

        for(WebElement eachLink : allLinks){
           String textOfEachLink = eachLink.getText();
            System.out.println("textOfEachLink = " + textOfEachLink);

            if(textOfEachLink.isEmpty()){
               linksWithoutText++;
           }else {
               linksWithText++;
           }
        }

        System.out.println("linksWithoutText = " + linksWithoutText);
        System.out.println("linksWithText = " + linksWithText);

        //  7.Print out how many total linkTC
        int totalLinks = allLinks.size();

        System.out.println("totalLinks = " + totalLinks);

    }

}
