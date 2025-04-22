package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;

    private final By EXEMPT_VAT_COLUMN = By.xpath("//th[contains(text(), 'Exempt VAT')]");
    private final By WITHHELD_VAT_COLUMN = By.xpath("//th[contains(text(), 'Withheld VAT')]");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportReport() {
        // Logic for exporting report
    }

    public boolean isExemptVATColumnPresent() {
        // Verify presence of Exempt VAT column
        return driver.findElements(EXEMPT_VAT_COLUMN).size() > 0;
    }

    public boolean isWithheldVATColumnPresent() {
        // Verify presence of Withheld VAT column
        return driver.findElements(WITHHELD_VAT_COLUMN).size() > 0;
    }

    public boolean verifyExemptVATValues() {
        // Logic to verify correct Exempt VAT values
        return true;
    }

    public boolean verifyWithheldVATValues() {
        // Logic to verify correct Withheld VAT values
        return true;
    }
}