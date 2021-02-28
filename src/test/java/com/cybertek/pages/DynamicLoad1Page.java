package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button[class='btn btn-primary']")
    public WebElement startButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement invalidMessage;


}
