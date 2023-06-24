package com.telus.autotest.webui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author Yurii Pavliuk
 */
public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElementFacade searchBar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElementFacade searchIcon;

    public void clickSearchBar() {
        searchBar.waitUntilClickable().click();
        waitForRequestsToFinish();
    }

    public void clickSearchIcon() {
        searchIcon.waitUntilClickable().click();
        waitForRequestsToFinish();
    }
}