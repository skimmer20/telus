package com.telus.autotest.steps.stepDefinitions;

import com.telus.autotest.steps.testSteps.MainPageTestSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * @author Yurii Pavliuk
 */
public class MainPageStepDefinitions {

    @Steps
    MainPageTestSteps mainPageTestSteps;

    @Given("^I click on search bar$")
    public void iClickOnSearchBar() {
        mainPageTestSteps.clickSearchBar();
    }

    @Given("^I click on search results")
    public void iClickOnSearchResults() {
        mainPageTestSteps.clickSearchResults();
    }

}
