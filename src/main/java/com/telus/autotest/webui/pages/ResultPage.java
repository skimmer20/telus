package com.telus.autotest.webui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Pavliuk
 */
public class ResultPage extends BasePage {

    @FindBy(id = "low-price")
    private WebElementFacade minPrice;

    @FindBy(id = "high-price")
    private WebElementFacade maxPrice;

    @FindBy(xpath = "//*[@id='p_36/price-range']//*[@type='submit']")
    private WebElementFacade goButton;


    public void setMinMaxPrice(String price1, String price2) {
        minPrice.waitUntilClickable().click();
        sendCharacters(price1);
        pressTab();
        sendCharacters(price2);
        goButton.click();
        waitForRequestsToFinish();
    }

    public List<String> getAllPrices() {
        List<String> items = new ArrayList<>();
        findAll(By.xpath("//span[@class='a-price-whole']")).forEach(element -> items.add(element.getText()));
        return items;
    }

    public void selectItemByIndex(String number) {
        find(By.xpath("//div[@data-csa-c-pos='" + number + "']//h2/a[@href]")).waitUntilClickable().click();
        waitForRequestsToFinish();
    }
}
