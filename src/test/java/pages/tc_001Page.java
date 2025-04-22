package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;
    // Element locators
    By campoNumeroSiniestro = By.id("numeroSiniestro");
    By campoNumeroAutorizacion = By.id("numeroAutorizacion");
    By campoStatus = By.id("status");
    By campoTipoMovimiento = By.id("tipoMovimiento");
    By campoNumeroMovimiento = By.id("numeroMovimiento");
    By columnaC = By.id("columnaC");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirHojaDeCalculo() {
        // Implementación para abrir la hoja de cálculo
    }

    public void extraerCampos() {
        // Implementación para extraer campos
        driver.findElement(campoNumeroSiniestro).getText();
        driver.findElement(campoNumeroAutorizacion).getText();
        driver.findElement(campoStatus).getText();
        driver.findElement(campoTipoMovimiento).getText();
        driver.findElement(campoNumeroMovimiento).getText();
    }

    public void verificarExtraccionCampos() {
        // Implementación para verificar extracción de campos
    }

    public void aplicarFormulaConcatenate() {
        // Implementación para aplicar la formula de concatenación
        driver.findElement(columnaC).sendKeys("=CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)");
    }

    public void verificarLlaveGenerada() {
        // Implementación para verificar que la llave generada es correcta
    }
}