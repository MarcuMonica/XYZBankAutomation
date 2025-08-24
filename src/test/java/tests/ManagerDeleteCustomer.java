package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ManagerCustomerPage;
import pages.ManagerPage;
import sharedData.SharedData;
import suite.Suite;

public class ManagerDeleteCustomer extends SharedData {
    @Test(groups = {Suite.REGRESSION_SUITE, Suite.SANITY_SUITE})
    public void frameTestMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithBankManagerLogin();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.interactWithCustomerButton();

        ManagerCustomerPage managerCustomerPage = new ManagerCustomerPage(getDriver());
        managerCustomerPage.fillTheForm("Hermoine");
        managerCustomerPage.deleteCustomer();
        managerCustomerPage.clearSearchField();
    }
}
