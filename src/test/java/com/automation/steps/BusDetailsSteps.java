package com.automation.steps;

import com.automation.pages.BusDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BusDetailsSteps {

    BusDetails busDetails = new BusDetails();

    @Then("verify user is on Bus Details page")
    public void verify_user_is_on_bus_details_page() {
        Assert.assertTrue(busDetails.isBusDetailsPageDisplayed());
    }

    @When("user click on view seats")
    public void user_click_on_view_seats() {
        busDetails.viewAndSelectSeat();
    }

    @Then("verify seat is displayed")
    public void verify_seat_is_displayed() {
        Assert.assertTrue(busDetails.isSeatsVisible());
    }

    @And("click on modify")
    public void clickOnModify() {
        busDetails.clickModify();
    }
}
