package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterNavigate {



    @Then("I see the register text")
    public void iSeeTheRegisterText() {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Register Text not displayed");
    }
}
