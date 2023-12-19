package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");

    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
      new LoginPage().clickOnLoginButton();
    }

    @Then("I see the Error message")
    public void iSeeTheErrorMessage() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "error message not displayed");

    }



    @Then("I see the LogOut link is display")
    public void ISeeTheLogOutLinkIsDisplay() {
        String expectedMessage = "Log out";

        String actualMessage = new HomePage().getVerifyLogOutText();
        Assert.assertEquals(actualMessage, expectedMessage, "error message not displayed");
    }

    @And("I click on LogOut button")
    public void iClickOnLogOutButton() {
        new HomePage().clickOnLogOutButton();
    }

    @Then("I see the LoginLink is displayed")
    public void iSeeTheLoginLinkIsDisplayed() {
        String expectedMessage = "Log in";

        String actualMessage = new HomePage().getVerifyLogInText();
        Assert.assertEquals(actualMessage, expectedMessage, "LogIn not displayed");
    }
}


