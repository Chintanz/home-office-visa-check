package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationSteps {

    @Given("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @When("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String nationality) {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason {string}")
    public void iSelectReasonTourism(String reason) {
        new ReasonForTravelPage().selectReasonForVisit("Tourism");
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }


    @Then("verify result {string}")
    public String verifyResultYouWillNotNeedAVisaToComeToTheUK(String result) {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = new ResultPage().getResultMessageTourism();
        Assert.assertEquals(expectedMessage, actualMessage, "You will not need a visa to come to the UK");
        return expectedMessage;
    }
}


















