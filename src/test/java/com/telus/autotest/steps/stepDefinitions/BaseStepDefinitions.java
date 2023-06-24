package com.telus.autotest.steps.stepDefinitions;

import com.telus.autotest.rest.testData.DataHandler;
import com.telus.autotest.steps.testSteps.BaseTestSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * @author Yurii Pavliuk
 */
public class BaseStepDefinitions {

    @Steps
    BaseTestSteps baseTestSteps;

    String uri = DataHandler.getInstance().getBaseURL();

    @Given("^I navigate to the Amazon$")
    public void iNavigateToTheAmazon(){
        baseTestSteps.goToUrl(uri);
    }

    @Given("^I type '([^']*?)'$")
    public void iTypeText(String text){
        baseTestSteps.type(text);
    }

    @Given("^I click checkbox with name '([^']*?)'$")
    public void iClickCheckboxWithName(String section, String name){
        baseTestSteps.clickCheckboxByName(section, name);
    }
}
