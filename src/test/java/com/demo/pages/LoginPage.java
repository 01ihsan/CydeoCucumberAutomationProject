package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "login")
    public WebElement userNameBox;
    @FindBy(name = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}
