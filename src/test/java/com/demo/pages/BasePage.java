package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement UserName;
    @FindBy(xpath = "//li[@class='o_user_menu open']//ul[@class='dropdown-menu']")
    public WebElement UserNameDropdownMenu;
    @FindBy(xpath = "//li[.='Log out']")
    public WebElement logoutButton;
}