package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I enter First Name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter Last Name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I Select Day in Date Of Month Field")
    public void iSelectDayInDateOfMonthField() {
        new RegisterPage().selectDayByValue("2");
    }

    @And("I Select Month in Date Of Month Field")
    public void iSelectMonthInDateOfMonthField() {
        new RegisterPage().selectMonthByValue("2");
    }

    @And("I Select Year in Date Of Month Field")
    public void iSelectYearInDateOfMonthField() {
        new RegisterPage().selectYearByValue("2023");
    }

    @And("I enter Email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmailField(email);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPasswordField(password);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPasswordField(confirmPassword);
    }

    @Then("registration successful")
    public void registrationSuccessful() {
        String expectedText = "Your registration completed";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText,expectedText);
    }
}
