package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_011Page;

public class tc_011Steps {

    tc_011Page page;

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String pageName) {
        page = new tc_011Page();
        page.navigateToPage(pageName);
    }

    @When("I examine the 'IVA Acumulado' formula")
    public void i_examine_the_iva_acumulado_formula() {
        page.examineIvaAcumuladoFormula();
    }

    @Then("the formula should include only IVA 16%, IVA FRONTERIZO, IVA 0%, and IVA EXENTO")
    public void the_formula_should_include_correct_iva() {
        Assert.assertTrue(page.isFormulaIncludingCorrectIVA());
    }

    @Then("the formula should exclude IVA retenido")
    public void the_formula_should_exclude_iva_retenido() {
        Assert.assertTrue(page.isFormulaExcludingIvaRetenido());
    }

    @Given("I have a list of IVA amounts")
    public void i_have_a_list_of_iva_amounts() {
        page.prepareIvaAmounts();
    }

    @When("I add IVA 16%, IVA FRONTERIZO, IVA 0%, and IVA EXENTO")
    public void i_add_iva_amounts() {
        page.addIvaAmounts();
    }

    @Then("the 'IVA Acumulado' should reflect the correct accumulated sum")
    public void the_iva_acumulado_should_reflect_correct_sum() {
        Assert.assertEquals(page.getExpectedIvaAcumulado(), page.getActualIvaAcumulado());
    }
}