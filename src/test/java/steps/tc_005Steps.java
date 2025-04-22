package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page page;

    @Given("I am on the application page displaying the column 'Monto Acumulado Folio OPC'")
    public void openApplicationPage() {
        driver = new ChromeDriver();
        driver.get("http://application-url.com");
        page = new tc_005Page(driver);
    }

    @When("I check the current name of the header in Column Z")
    public void checkCurrentHeaderName() {
        // Placeholder for actions if needed to focus or scroll to the column
    }

    @Then("the header should appear as 'Monto Acumulado Folio OPC (2121)'")
    public void validateColumnHeaderName() {
        String actualHeaderName = page.getColumnHeaderText();
        Assert.assertEquals("Monto Acumulado Folio OPC (2121)", actualHeaderName);
    }

    @Then("there should be no conflicting data with previous columns")
    public void validateNoConflictingData() {
        boolean isDataConflictFree = page.checkForDataConflicts();
        Assert.assertTrue(isDataConflictFree);
        driver.quit();
    }
}