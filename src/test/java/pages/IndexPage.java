package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {


    @FindBy(xpath = "//button[text()='Customer Login']")
    private WebElement customerLoginElement;
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    private WebElement  managerLoginElement;


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void interactWithCustomerLoginButton(){
        elementHelper.ultraJSElement(customerLoginElement);
        LoggerUtility.infoLog("The user clicks on the Customer Login Button");
    }

    public void interactWithBankManagerLogin(){
        elementHelper.ultraJSElement(managerLoginElement);
        LoggerUtility.infoLog("The user clicks on Bank Manager Login");
    }
}
