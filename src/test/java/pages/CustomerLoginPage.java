package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends BasePage {
    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="userSelect")
    private WebElement userSelectDropdown;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public void interactWithDropdown(String customer) {
        elementHelper.waitVisibleElement(userSelectDropdown);
        elementHelper.selectDropDownMethod(userSelectDropdown, customer);
        LoggerUtility.infoLog("The user clicks on dropdown");
    }

    public void interactWithLoginButton(){
        elementHelper.waitVisibleElement(loginButton);
        elementHelper.ultraJSElement(loginButton);
        LoggerUtility.infoLog("The user clicks on login button");
    }


}
