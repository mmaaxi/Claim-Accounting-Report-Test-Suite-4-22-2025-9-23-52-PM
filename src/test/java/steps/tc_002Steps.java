package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("the export file is downloaded")
    public void the_export_file_is_downloaded() {
        page.downloadExportFile();
    }

    @When("I review the columns in the export file")
    public void i_review_the_columns_in_the_export_file() {
        page.loadExportFile();
    }

    @Then("the 'Estado Código' column should be included")
    public void the_estado_codigo_column_should_be_included() {
        Assert.assertTrue(page.isEstadoCodigoColumnPresent());
    }

    @Then("it should be positioned to the right of the 'i' column")
    public void it_should_be_positioned_to_the_right_of_the_i_column() {
        Assert.assertTrue(page.isEstadoCodigoColumnPositionCorrect());
    }
}