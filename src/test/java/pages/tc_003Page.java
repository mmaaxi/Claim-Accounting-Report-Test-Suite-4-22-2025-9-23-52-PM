import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class tc_003Page {

    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for the 'estado' column header
    @FindBy(xpath = "//th[contains(text(),'estado')]")
    private WebElement headerEstado;

    // Locate rows under 'estado' column
    @FindBy(xpath = "//table[@id='estado_table']//td[contains(@class,'estado')]")
    private List<WebElement> estadoRows;

    public void verifyHeaderEstado() {
        if (!headerEstado.isDisplayed()) {
            throw new AssertionError("The 'estado' header is not displayed");
        }
    }

    public String getHeaderEstadoText() {
        return headerEstado.getText();
    }

    public void compareEstadoColumnData() {
        // Code to compare current data with expected values
    }

    public List<String> getExpectedData() {
        // Placeholder for method to get expected data
        return List.of("Expected", "Data", "Values");
    }

    public List<String> getActualData() {
        // Placeholder for method to extract and return the data from the 'estado' column
        return estadoRows.stream().map(WebElement::getText).toList();
    }
}