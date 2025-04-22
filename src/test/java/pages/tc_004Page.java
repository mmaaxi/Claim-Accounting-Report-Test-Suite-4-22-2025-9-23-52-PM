package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;

    By montoAnteriorInput = By.id("montoAnterior");
    By montoActualInput = By.id("montoActual");
    By montoAcumuladoTexto = By.id("montoAcumulado");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeReservas() {
        driver.get("http://sistema-reservas.com/reservas");
    }

    public void insertarMontoAnterior(String monto) {
        driver.findElement(montoAnteriorInput).clear();
        driver.findElement(montoAnteriorInput).sendKeys(monto);
    }

    public void insertarMontoActual(String monto) {
        driver.findElement(montoActualInput).clear();
        driver.findElement(montoActualInput).sendKeys(monto);
    }

    public String obtenerMontoAnterior() {
        return driver.findElement(montoAnteriorInput).getAttribute("value");
    }

    public String obtenerMontoActual() {
        return driver.findElement(montoActualInput).getAttribute("value");
    }

    public int obtenerMontoAcumulado() {
        String textoMonto = driver.findElement(montoAcumuladoTexto).getText();
        return Integer.parseInt(textoMonto);
    }
}