package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage extends BasePage {
    public ManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    private WebElement openAccountButton;
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    private WebElement customerButton;

    public void interactWithAddCustomerButton() {
        elementHelper.waitVisibleElement(addCustomerButton);
        elementHelper.ultraJSElement(addCustomerButton);
        LoggerUtility.infoLog("The user clicks on Add Customer Button");
    }

    public void interactWithOpenAccountButton(){
        elementHelper.waitVisibleElement(openAccountButton);
        elementHelper.ultraJSElement(openAccountButton);
        LoggerUtility.infoLog("The user clicks on Open Account Button");
    }

    public void interactWithCustomerButton(){
        elementHelper.waitVisibleElement(customerButton);
        elementHelper.ultraJSElement(customerButton);
        LoggerUtility.infoLog("The user clicks on Customer Button");
    }


}
