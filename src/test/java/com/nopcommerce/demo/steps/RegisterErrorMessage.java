package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterErrorMessage {
    @Then("I am in Register page")
    public void iAmInRegisterPage() {
    }

    @And("I click on Register Button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the First name is required error message")
    public void iShouldSeeTheFirstNameIsRequiredErrorMessage() {
        String expectText1 = "First name is required.";
        String actualText1 = new RegisterPage().getFirstNameError();
        Assert.assertEquals(actualText1,expectText1);
    }

    @And("I should see the Last name is required error message")
    public void iShouldSeeTheLastNameIsRequiredErrorMessage() {
        String expectText2 = "Last name is required.";
        String actualText2 = new RegisterPage().getLastNameError();
        Assert.assertEquals(actualText2,expectText2);
    }

    @And("I should see the Email is required error message")
    public void iShouldSeeTheEmailIsRequiredErrorMessage() {
        String expectText3 = "Email is required.";
        String actualText3 = new RegisterPage().getEmailFieldError();
        Assert.assertEquals(actualText3,expectText3);

    }

    @And("I should see the Password is required error message")
    public void iShouldSeeThePasswordIsRequiredErrorMessage() {
        String expectText4 = "Password is required.";
        String actualText4 = new RegisterPage().getPasswordFieldError();
        Assert.assertEquals(actualText4,expectText4);

    }

    @And("I should see the Confirm Password is required error message")
    public void iShouldSeeTheConfirmPasswordIsRequiredErrorMessage() {
        String expectText5 = "Password is required.";
        String actualText5 = new RegisterPage().getConfirmPasswordFieldError();
        Assert.assertEquals(actualText5,expectText5);
    }
}
