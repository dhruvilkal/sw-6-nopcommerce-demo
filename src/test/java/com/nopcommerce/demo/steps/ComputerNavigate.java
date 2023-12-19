package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerNavigate {
    @When("I am click on Computer Tab")
    public void iAmClickOnComputerTab() {
        new HomePage().clickOnComputersMenu();
    }

    @Then("I see computer text successfully")
    public void iSeeComputerTextSuccessfully() {
        new ComputerPage().getComputersText();
    }
}
