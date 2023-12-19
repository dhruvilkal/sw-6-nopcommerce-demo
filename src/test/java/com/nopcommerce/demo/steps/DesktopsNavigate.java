package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsNavigate {
    @When("I am doing mouseHover On ComputerTab")
    public void iAmDoingMouseHoverOnComputerTab() {
new HomePage().mouseHoverOnComputerTab();
    }
    @And("I am click on Desktops link")
    public void iAmClickOnDesktopsLink() {
        new HomePage().clickOnDesktop();
    }

    @Then("I see desktops text successfully")
    public void iSeeDesktopsTextSuccessfully() {
        String expectedMessage = "Desktops";
        String actualMessage = new DesktopsPage().getProductAddMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Desktops Text not displayed");
    }


}
