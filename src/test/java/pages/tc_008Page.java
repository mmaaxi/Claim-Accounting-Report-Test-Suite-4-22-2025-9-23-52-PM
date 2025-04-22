package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import java.util.Map;

public class tc_008Page {
    WebDriver driver;

    By pagoMovimientoSection = By.id("pagoMovimientoSection");
    By formulaCell = By.id("formulaCell");
    By accumulatedAmountResult = By.id("accumulatedAmountResult");
    Map<String, Integer> inputData;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPagoMovimiento() {
        driver.findElement(pagoMovimientoSection).click();
    }

    public void checkFormula() {
        // Logic to check the formula in the cell
    }

    public String getCellFormula() {
        return driver.findElement(formulaCell).getText();
    }

    public void fillSimulationData(DataTable dataTable) {
        for (Map.Entry<String, Integer> entry : dataTable.asMaps(String.class, Integer.class).get(0).entrySet()) {
            inputData.put(entry.getKey(), entry.getValue());
        }
        // Introduce los valores simulados en las respectivas celdas
    }

    public int calculateAccumulatedAmount() {
        // Implementación lógica para calcular la suma basada en los datos ingresados
        return inputData.values().stream().mapToInt(Integer::intValue).sum();
    }
}