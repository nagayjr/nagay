package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Helper;

import static support.TestContext.getDriver;

public class QuoteStepdefs3 {
    @Given("I open Nop {string} Portnov page")
    public void iOpenNopQAPortnovPage(String urlName) {
        getDriver().get(Helper.getUrlFor(urlName));
    }

    @When("I enter {string} add to card")
    public void iEnterForTheUsernameField(String elementName) {
        getDriver().findElement(By.xpath(Helper.getXpathFor(elementName))).click();
    }

    @Then("I wait to {string} to be present")
    public void iWaitToToBePresent(String elementName) {
        new WebDriverWait(getDriver(), 10, 200)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.
                                xpath(Helper.getXpathFor(elementName))));
    }

    @Then("I click on {string}")
    public void iClickOn(String arg0) {
            getDriver().findElement(By.xpath(Helper.getXpathFor(arg0))).click();
        }
}