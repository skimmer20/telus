package com.telus.autotest.steps.testSteps;

import com.telus.autotest.webui.pages.BasePage;
import com.telus.autotest.webui.pages.ResultPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static java.lang.Integer.parseInt;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Yurii Pavliuk
 */
public class ResultTestSteps {

    BasePage basePage;
    ResultPage resultPage;

    @Step
    public void selectCellPhoneCompatibilityByName(String section, List<String> phoneName) {
        phoneName.forEach(name -> basePage.clickCheckboxByName(section, name));
    }

    @Step
    public void setMinMaxPrice(String minPrice, String maxPrice) {
        resultPage.setMinMaxPrice(minPrice, maxPrice);
    }

    @Step
    public void verifyFinalPrice(String minValue, String maxValue) {
        List<String> itemsList = resultPage.getAllPrices();
        for (String finalPrice : itemsList) {
            assertThat(parseInt(finalPrice)).isBetween(parseInt(minValue), parseInt(maxValue));
        }
    }

    @Step
    public void selectItemByIndex(String number) {
        resultPage.selectItemByIndex(number);
    }
}
