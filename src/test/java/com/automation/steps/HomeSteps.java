package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user open website")
    public void user_open_website() {
        homePage.openWebsite();
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        Assert.assertTrue(homePage.isHomepageDisplayed());
    }

    @When("user enter details with source {string}  and destination {string}")
    public void user_enter_details_with_source_and_destination(String src, String dest) {
        homePage.enterSourceAndDestination(src, dest);
    }


    @When("user enter date and click on search button")
    public void userEnterDateAndClickOnSearchButton() {
        homePage.enterDate();
    }
}
