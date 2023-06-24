package com.telus.autotest.steps.testSteps;

import com.telus.autotest.webui.pages.BasePage;
import net.thucydides.core.annotations.Step;

/**
 * @author Yurii Pavliuk
 */
public class BaseTestSteps {

    BasePage basePage;

    @Step
    public void goToUrl(String url) {
        basePage.goToUrl(url);
    }

    @Step
    public void type(String text) {
        basePage.sendCharacters(text);
    }

    @Step
    public void clickCheckboxByName(String section, String name) {
        basePage.clickCheckboxByName(section, name);
    }

}
