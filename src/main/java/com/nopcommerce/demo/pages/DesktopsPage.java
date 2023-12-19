package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    /*********** All Elements' Path on DesktopsPage ****************/

    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320Gb;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd400Gb;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osVistaHome;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osVistaPremium;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOffice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddMessageText;


    /*********** All Elements' Action Methods on DesktopsPage **************/

    public String getDesktopText() {
        return getTextFromElement(desktopsText);
    }

    public void clickOnProductName() {
        clickOnElement(productName);
    }

    public void selectProcessor(String processor2) {
        selectByVisibleTextFromDropDown(processorFromDropDown, processor2);
    }

    public void selectRAM(String ram2) {
        selectByValueFromDropDown(ramFromDropDown, ram2);
    }

    public void clickOn320GB() {
        clickOnElement(hdd320Gb);
    }

    public void clickOn400GB() {
        clickOnElement(hdd400Gb);
    }

    public void clickOnVistaHome() {
        clickOnElement(osVistaHome);
    }

    public void clickOnVistaPremium() {
        clickOnElement(osVistaPremium);
    }

    public void clickOnMicrosoftOffice() {
        clickOnElement(softwareMicrosoftOffice);
    }

    public void clickOnAcrobatReader() {
        clickOnElement(softwareAcrobatReader);
    }

    public void clickOnTotalCommander() {
        clickOnElement(softwareTotalCommander);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getProductAddMessage() {
        return getTextFromElement(productAddMessageText);
    }
}
