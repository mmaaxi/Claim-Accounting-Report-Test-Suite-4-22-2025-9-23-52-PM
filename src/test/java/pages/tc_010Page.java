package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class tc_010Page extends BasePage {

    private WebDriver driver;

    public tc_010Page() {
        this.driver = getDriver();
    }

    public void navigateToTablePage() {
        driver.get("http://miaplicacion.com/tablapagos");
    }

    public boolean isColumnOnTheRight(String rightColumn, String referenceColumn) {
        WebElement refColumn = driver.findElement(By.xpath("//th[text()='" + referenceColumn + "']"));
        WebElement rightCol = refColumn.findElement(By.xpath("following-sibling::th[text()='" + rightColumn + "']"));
        return rightCol != null;
    }

    public boolean isColumnPresentWithoutData(String columnName) {
        WebElement column = driver.findElement(By.xpath("//th[text()='" + columnName + "']"));
        return column != null && column.findElement(By.xpath("following-sibling::td")).getText().isEmpty();
    }

    public boolean isColumnRenamed(String originalColumnName, String newColumnName) {
        WebElement newCol = driver.findElement(By.xpath("//th[text()='" + newColumnName + "']"));
        return newCol != null;
    }

    public boolean isColumnHeaderCorrect(String headerName) {
        WebElement header = driver.findElement(By.xpath("//th[text()='" + headerName + "']"));
        return header != null;
    }
}