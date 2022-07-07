package com.demo.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void userIsOnTheLibraryLogInPage() {
    }

    @When("user enters {string}")
    public void userEntersUserName(String userName) {

    }

    @And("user types {string}")
    public void userTypes(String arg0) {
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
    }
}