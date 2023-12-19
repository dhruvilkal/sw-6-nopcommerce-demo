@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @author_Dhruvil @sanity @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @author_Dhruvil  @smoke
  Scenario: verifyTheErrorMessageWithInValidCredentials
    Given I am on homepage
    When  I click on login link
    And   I enter email "manis@gmail.com"
    And   I enter password "manish@12"
    And  I click on login button
    Then  I see the Error message

  @author_Dhruvil
  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials
    Given  I am on homepage
    When  I click on login link
    And   I enter email "manish@gmail.com"
    And   I enter password "manish@123"
    And  I click on login button
    Then I see the LogOut link is display

  @author_Dhruvil
  Scenario:VerifyThatUserShouldLogOutSuccessFully
    Given  I am on homepage
    When  I click on login link
    And   I enter email "manish@gmail.com"
    And   I enter password "manish@123"
    And  I click on login button
    And  I click on LogOut button
    Then I see the LoginLink is displayed





