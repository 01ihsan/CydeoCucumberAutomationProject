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

public class LogoutStepDefinitions {
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is already logged-in with {string} and {string}")
    public void userIsAlreadyLoggedInWithAnd(String userName, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));
        loginPage.userNameBox.clear();
        loginPage.userNameBox.sendKeys(userName);
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginButton.click();
    }

    @When("user clicks on the username field")
    public void userClicksOnTheUsernameField() {
        basePage.UserName.click();
    }

    @And("user selects the logout from dropdown menu")
    public void userSelectsTheLogoutFromDropdownMenu() {
        basePage.logoutButton.click();
    }

    @Then("user should be able to logout")
    public void userShouldBeAbleToLogout() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
}
