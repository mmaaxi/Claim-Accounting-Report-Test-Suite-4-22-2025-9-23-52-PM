package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    
    WebDriver driver;

    // Locate the header in Column Z
    By columnHeaderLocator = By.xpath("//table/thead/tr/th[20]"); // assuming Column Z is the 20th column
    // Locator for checking data conflicts
    By dataConflictLocator = By.id("conflictIndicator"); // placeholder locator for conflicting data indicator

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getColumnHeaderText() {
        WebElement columnHeader = driver.findElement(columnHeaderLocator);
        return columnHeader.getText();
    }

    public boolean checkForDataConflicts() {
        // This is a placeholder for a real implementation to check for data conflicts
        WebElement conflictIndicator = driver.findElement(dataConflictLocator);
        return !conflictIndicator.isDisplayed();
    }
}