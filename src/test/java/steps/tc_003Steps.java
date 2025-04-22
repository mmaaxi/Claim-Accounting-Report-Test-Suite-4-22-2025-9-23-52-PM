import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page estadoPage;

    public tc_003Steps() {
        this.driver = Hooks.driver;
        estadoPage = PageFactory.initElements(driver, tc_003Page.class);
    }

    @Given("I navigate to the relevant page")
    public void iNavigateToTheRelevantPage() {
        driver.get("http://url_to_the_page_with_estado_column");
    }

    @When("I check the header for 'estado'")
    public void iCheckTheHeaderForEstado() {
        estadoPage.verifyHeaderEstado();
    }
    
    @Then("The header matches the updated specifications in the \"Descripción de Campos\" sheet")
    public void theHeaderMatches() {
        String expectedHeader = "Expected Header from Description Sheet";
        assertEquals(expectedHeader, estadoPage.getHeaderEstadoText());
    }

    @Given("I am on the page with the 'estado' column")
    public void iAmOnThePageWithTheEstadoColumn() {
        // Already navigated in previous step
    }
    
    @When("I compare the current data with expected values")
    public void iCompareTheCurrentData() {
        estadoPage.compareEstadoColumnData();
    }

    @Then("The 'estado' column contains the correct information")
    public void theEstadoColumnContainsCorrectInformation() {
        assertEquals(estadoPage.getExpectedData(), estadoPage.getActualData());
    }
}