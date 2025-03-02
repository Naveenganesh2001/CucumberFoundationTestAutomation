package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BusDetails extends BasePage{
    @FindBy(xpath = "//div[@class='button view-seats fr']")
    List<WebElement> numberOfBus;

    @FindBy(xpath = "//ul[@class='bus-items']")
    WebElement busDetailsPageDisplayed;

    @FindBy(xpath = "//div[@class='label']")
    WebElement seatsVisible;

    @FindBy(xpath = "//div[@class='onward-modify-btn g-button clearfix fl']")
    WebElement modify;

    public boolean isBusDetailsPageDisplayed(){
        return busDetailsPageDisplayed.isDisplayed();
    }
    public void viewAndSelectSeat()  {
        WebElement viewSeat = numberOfBus.get(0);
        viewSeat.click();

    }
    public boolean isSeatsVisible(){
        return seatsVisible.isDisplayed();
    }

    public void clickModify(){
        modify.click();
    }
}
