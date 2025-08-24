package tests;

import org.testng.annotations.Test;
import pages.CustomerLoginPage;
import pages.IndexPage;
import sharedData.SharedData;
import suite.Suite;

public class CustomerLoginTest extends SharedData {
    @Test(groups = {Suite.REGRESSION_SUITE, Suite.SANITY_SUITE})
    public void frameTestMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerLoginButton();

        CustomerLoginPage customerLoginPage = new CustomerLoginPage(getDriver());
        customerLoginPage.interactWithDropdown("Hermoine Granger");
        customerLoginPage.interactWithLoginButton();
    }
}
