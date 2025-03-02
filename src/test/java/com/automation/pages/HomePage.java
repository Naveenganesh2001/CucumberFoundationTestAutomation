package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='sc-cMljjf exaxGE']")
    WebElement homePageLink;

    @FindBy(xpath = "//input[@class='sc-bxivhb dsDRlf' and @id='src']")
    WebElement sourceText;

    @FindBy(xpath = "//input[@class='sc-bxivhb dsDRlf' and @id='dest']")
    WebElement destText;

    @FindBy(xpath = "//div[@class='sc-fjdhpX elUAqf']")
    WebElement calendar;

    @FindBy(xpath = "//div[@class='sc-gZMcBi hviMLb']//text[text()='Coimbatore']")
    WebElement sourceCity;
    @FindBy(xpath = "//div[@class='sc-gZMcBi hviMLb']//text[text()='Thiruvananthapuram']")
    WebElement destCity;

    @FindBy(xpath = "//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH' and text()=15]")
    WebElement date;

    @FindBy(xpath = "//button[@id='search_button']")
    WebElement searchBtn;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isHomepageDisplayed() {
        return homePageLink.isDisplayed();
    }

    public void enterSourceAndDestination(String source, String destination) {
        sourceText.sendKeys(source);
        sourceCity.click();
        destText.sendKeys(destination);
        destCity.click();

    }

    public void enterDate() {
        searchBtn.click();
        date.click();
        searchBtn.click();

    }

}
