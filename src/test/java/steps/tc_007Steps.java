package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("^I have exported the report$")
    public void iHaveExportedTheReport() {
        page.exportReport();
    }

    @When("^I inspect the report for 'Exempt VAT' and 'Withheld VAT' columns$")
    public void iInspectTheReport() {
        // Implementation not needed here
    }

    @Then("^I should see the 'Exempt VAT' and 'Withheld VAT' columns present in the file$")
    public void shouldSeeColumnsPresent() {
        Assert.assertTrue(page.isExemptVATColumnPresent());
        Assert.assertTrue(page.isWithheldVATColumnPresent());
    }

    @Then("^the 'Exempt VAT' column should contain the correct values$")
    public void exemptVATColumnCorrectValues() {
        Assert.assertTrue(page.verifyExemptVATValues());
    }

    @Then("^the 'Withheld VAT' column should contain the correct values$")
    public void withheldVATColumnCorrectValues() {
        Assert.assertTrue(page.verifyWithheldVATValues());
    }
}