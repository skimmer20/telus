package com.telus.autotest.steps.testSteps;

import com.telus.autotest.webui.pages.MainPage;
import net.thucydides.core.annotations.Step;

/**
 * @author Yurii Pavliuk
 */
public class MainPageTestSteps {

    MainPage mainPage;

    @Step
    public void clickSearchBar() {
        mainPage.clickSearchBar();
    }

    @Step
    public void clickSearchResults() {
        mainPage.clickSearchIcon();
    }

}
