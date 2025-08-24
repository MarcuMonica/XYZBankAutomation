package pages;

import helpermethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public AlertHelper alertHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
        this.alertHelper = new AlertHelper(driver);
        PageFactory.initElements(driver, this);
    }
}
