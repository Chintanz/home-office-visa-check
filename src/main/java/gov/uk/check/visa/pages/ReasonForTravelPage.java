package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> selectReason;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;



    public void selectReasonForVisit(String reason) {

        log.info("Select reason for visit." + reason + "from options" + selectReason.toString());
        for (WebElement reasonForVisit : selectReason) {
            if (reasonForVisit.getText().equalsIgnoreCase(reason)) {
                clickOnElement(reasonForVisit);
                break;
            }
        }
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button." + continueButton.toString());

        clickOnElement(continueButton);
    }











}
