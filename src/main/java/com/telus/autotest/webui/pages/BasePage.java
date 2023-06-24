package com.telus.autotest.webui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Yurii Pavliuk
 */
public class BasePage extends PageObject {

    public void goToUrl(String url) {
        getDriver().get(url);
    }

    public void waitForRequestsToFinish() {
        WaitUntil.angularRequestsHaveFinished();
    }

    public void sendCharacters(String characters) {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.chord(characters)).build().perform();
        waitForRequestsToFinish();
    }

    public void pressTab() {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.TAB).build().perform();
    }

    public void pressEnter() {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ENTER).build().perform();
        waitForRequestsToFinish();
    }

    private WebElementFacade getCheckboxByName(String name) {
        waitForRequestsToFinish();
        return find(By.xpath("//span[text()='" + name + "']"));
    }

    public void clickCheckboxByName(String section, String item) {
        getCheckboxByName(section)
                .find(By.xpath("parent::div/following::ul//span[text()='" + item + "']/preceding-sibling::div/label"))
                .click();
    }
}
