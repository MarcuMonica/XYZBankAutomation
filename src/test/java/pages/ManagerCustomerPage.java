package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerCustomerPage extends BasePage {
    public ManagerCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='searchCustomer']")
    private WebElement searchCustomerInput;
    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement deleteButton;

    public void fillTheForm(String customer) {
        elementHelper.waitVisibleElement(searchCustomerInput);
        elementHelper.fillElement(searchCustomerInput, customer);
        LoggerUtility.infoLog("The user searches for name value " + customer);
    }

    public void deleteCustomer(){
        elementHelper.waitVisibleElement(deleteButton);
        deleteButton.click();
        LoggerUtility.infoLog("The user deletes account");
    }

    public void clearSearchField(){
        elementHelper.waitVisibleElement(searchCustomerInput);
        elementHelper.clearElement(searchCustomerInput);
        LoggerUtility.infoLog("The user clears search field");
    }
}
