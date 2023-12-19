package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement verifyLogOutText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLogInText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMouseHover;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktops;




    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }
    public String getVerifyLogOutText() {
        String message = getTextFromElement(verifyLogOutText);
        log.info("Getting text from : " + verifyLogOutText.toString());
        return message;
    }
    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
        log.info("Clicking on logout button : " +logOutButton.toString());
    }
    public String getVerifyLogInText() {
        String message = getTextFromElement(verifyLogInText);
        log.info("Getting text from : " + verifyLogInText.toString());
        return message;
    }
    public void clickOnComputersMenu(){
        mouseHoverToElementAndClick(computersMenu);
    }
    public void clickOnDesktop(){
        mouseHoverToElementAndClick(desktops);
    }
    public void mouseHoverOnComputerTab(){
        mouseHoverToElement(computersMouseHover);
    }

}
