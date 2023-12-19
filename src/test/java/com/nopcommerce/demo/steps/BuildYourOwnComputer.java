package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class BuildYourOwnComputer {
    @And("I click on Click on product name Build your own computer")
    public void iClickOnClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnProductName();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new DesktopsPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new DesktopsPage().selectRAM(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        if (Objects.equals(hdd, "320 GB")){
            new DesktopsPage().clickOn320GB();
        }else if(Objects.equals(hdd, "400 GB [+$100.00]")) {
            new DesktopsPage().clickOn400GB();
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        if (Objects.equals(os, "Vista Home [+$50.00]")){
            new DesktopsPage().clickOnVistaHome();
        }else if(Objects.equals(os, "Vista Premium [+$60.00]")) {
            new DesktopsPage().clickOnVistaPremium();
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software) {
        if (software == "Microsoft Office [+$50.00]"){
            new DesktopsPage().clickOnMicrosoftOffice();
        }else if(software == "Acrobat Reader [+$10.00]") {
            new DesktopsPage().clickOnAcrobatReader();
        } else if(software == "Total Commander [+$5.00]") {
            new DesktopsPage().clickOnTotalCommander();
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I click On Add To Cart Button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @Then("I add Product Successfully In Cart")
    public void iAddProductSuccessfullyInCart() {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new DesktopsPage().getProductAddMessage();
        Assert.assertEquals(actualText,expectedText);
    }

    @When("I click on Computers Tab")
    public void iClickOnComputersTab() {
        new HomePage().mouseHoverOnComputerTab();
    }

    @And("I click on Desktop Tab")
    public void iClickOnDesktopTab() {
        new HomePage().clickOnDesktop();
    }
}
