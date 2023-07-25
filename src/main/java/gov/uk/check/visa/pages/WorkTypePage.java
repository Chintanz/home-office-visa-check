package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> selectTypesOfJob;


    public void selectJobTypes(String job) {
        log.info("Select job type." + job + "from options" + selectTypesOfJob.toString());
        for (WebElement jobType : selectTypesOfJob){
            if (jobType.getText().equalsIgnoreCase(job)) {
                clickOnElement(jobType);
                break;
            }
        }
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button." + continueButton.toString());
        clickOnElement(continueButton);
    }



}
