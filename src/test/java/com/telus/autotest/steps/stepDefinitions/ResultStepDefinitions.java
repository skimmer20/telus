package com.telus.autotest.steps.stepDefinitions;

import com.telus.autotest.steps.testSteps.MainPageTestSteps;
import com.telus.autotest.steps.testSteps.ResultTestSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import java.util.List;

/**
 * @author Yurii Pavliuk
 */
public class ResultStepDefinitions {

    @Steps
    ResultTestSteps resultTestSteps;

    @Given("^I select in '([^']*?)' the next items:$")
    public void iClickCheckboxWithName(String section, List<String> name) {
        resultTestSteps.selectCellPhoneCompatibilityByName(section, name);
    }

    @Given("^I choose price range from '([^']*?)' to '([^']*?)' dollars in Price section$")
    public void iClickCheckboxWithName(String minPrice, String maxPrice) {
        resultTestSteps.setMinMaxPrice(minPrice, maxPrice);
    }

    @Given("^I verify the prices for available items are between '([^']*?)' and '([^']*?)' dollars")
    public void iVerifyThePricesForAvailableItems(String minValue, String maxValue) {
        resultTestSteps.verifyFinalPrice(minValue, maxValue);
    }

    @Given("^I select item on position '([^']*?)'")
    public void iSelectItemOnPositionNumber(String number) {
        resultTestSteps.selectItemByIndex(number);
    }
}
