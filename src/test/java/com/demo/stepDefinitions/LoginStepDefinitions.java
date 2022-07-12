package com.demo.stepDefinitions;

import com.demo.pages.BasePage;
import com.demo.pages.LoginPage;
import com.demo.utilities.ConfigurationReader;
import com.demo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user is on the login page")
    public void userIsOnTheLibraryLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));
    }

    @When("user enters {string}")
    public void userEntersUserName(String userName) {
        loginPage.userNameBox.clear();
        loginPage.userNameBox.sendKeys(userName);
    }

    @And("user types {string}")
    public void userTypes(String password) {
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(password);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("page title should be {string};")
    public void pageTitleShouldBe(String pageTitle) {
        Assert.assertEquals(pageTitle, basePage.UserName.getText());
    }

    @Then("user should be able to see {string} on the upper right corner")
    public void userShouldBeAbleToSeeOnTheUpperRightCorner(String arg0) {
        Assert.assertEquals(arg0.split("@")[0].toLowerCase(), basePage.UserName.getText().toLowerCase());
    }

    @Then("user shouldn't be able to login")
    public void userShouldnTBeAbleToLogin() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Then("user should get Wrong login-password message")
    public void userShouldGetWrongLoginPasswordMessage() {
        Assert.assertTrue(loginPage.warningMessage.isDisplayed());
    }
}