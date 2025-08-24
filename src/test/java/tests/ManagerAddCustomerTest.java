package tests;

import helpermethods.AlertHelper;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ManagerAddCustomerPage;
import pages.ManagerPage;
import sharedData.SharedData;
import suite.Suite;

public class ManagerAddCustomerTest extends SharedData {
    @Test(groups = {Suite.REGRESSION_SUITE, Suite.SANITY_SUITE})
    public void frameTestMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithBankManagerLogin();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.interactWithAddCustomerButton();

        ManagerAddCustomerPage managerAddCustomerPage = new ManagerAddCustomerPage(getDriver());
        managerAddCustomerPage.fillTheForm("George", "Han", "345656");

        AlertHelper alertHelper = new AlertHelper(getDriver());
        alertHelper.acceptAlert();
    }
}
