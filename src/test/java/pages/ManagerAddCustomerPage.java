package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerAddCustomerPage extends BasePage {
    public ManagerAddCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='fName']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[@ng-model='lName']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@ng-model='postCd']")
    private WebElement postCodeInput;
    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    public void fillTheForm(String firstName, String lastName, String postCode) {
        elementHelper.waitVisibleElement(firstNameInput);
        elementHelper.fillElement(firstNameInput, firstName);
        LoggerUtility.infoLog("The user fills fist name with value " + firstName);

        elementHelper.waitVisibleElement(lastNameInput);
        elementHelper.fillElement(lastNameInput, lastName);
        LoggerUtility.infoLog("The user fill last name with value " + lastName);

        elementHelper.waitVisibleElement(postCodeInput);
        elementHelper.fillElement(postCodeInput, postCode);
        LoggerUtility.infoLog("The user fill post code with value " + postCode);

        elementHelper.clickElement(submitButton);
        LoggerUtility.infoLog("The user clicked on submit button");

    }
}
