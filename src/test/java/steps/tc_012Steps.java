package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_012Page;
import static org.junit.Assert.*;

public class tc_012Steps {
    WebDriver driver;
    tc_012Page claimAccountingReportPage = new tc_012Page(driver);

    @Given("^I access the Claim Accounting Report module$")
    public void i_access_the_Claim_Accounting_Report_module() {
        claimAccountingReportPage.navigateToClaimAccountingReport();
    }

    @When("^I execute the integration tests on the module$")
    public void i_execute_the_integration_tests_on_the_module() {
        claimAccountingReportPage.runIntegrationTests();
    }

    @Then("^the new design and formulas should not affect other reports$")
    public void the_new_design_and_formulas_should_not_affect_other_reports() {
        assertTrue(claimAccountingReportPage.verifyNoImpactOnOtherReports());
    }

    @Given("^I have mockups and real data inputs$")
    public void i_have_mockups_and_real_data_inputs() {
        claimAccountingReportPage.setupMockupsAndRealData();
    }

    @When("^I perform the interface and data consistency tests$")
    public void i_perform_the_interface_and_data_consistency_tests() {
        claimAccountingReportPage.testInterfaceAndDataConsistency();
    }

    @Then("^the report should remain coherent and free from integration errors$")
    public void the_report_should_remain_coherent_and_free_from_integration_errors() {
        assertTrue(claimAccountingReportPage.verifyReportCoherence());
    }
}