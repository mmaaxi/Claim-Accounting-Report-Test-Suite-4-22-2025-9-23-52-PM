package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFolioPreSolicitudVisible() {
        WebElement folioPreSolicitudColumn = driver.findElement(By.cssSelector("SELECTOR_DE_FOLIO_PRE_SOLICITUD"));
        return folioPreSolicitudColumn.isDisplayed();
    }

    public boolean isFolioPreSolicitudPositionedCorrectly() {
        WebElement folioPreSolicitudColumn = driver.findElement(By.cssSelector("SELECTOR_DE_FOLIO_PRE_SOLICITUD"));
        WebElement ramoColumn = driver.findElement(By.cssSelector("SELECTOR_DE_RAMO"));
        return folioPreSolicitudColumn.getLocation().getX() > ramoColumn.getLocation().getX();
    }

    public boolean isFolioPreSolicitudInitiallyEmpty() {
        WebElement folioPreSolicitudValue = driver.findElement(By.cssSelector("SELECTOR_DE_VALORES_DE_FOLIO_PRE_SOLICITUD"));
        return folioPreSolicitudValue.getText().isEmpty();
    }

    public boolean isFolioDePagoVisible() {
        WebElement folioDePagoColumn = driver.findElement(By.cssSelector("SELECTOR_DE_FOLIO_DE_PAGO"));
        return folioDePagoColumn.isDisplayed();
    }

    public boolean isFolioDePagoPositionedCorrectly() {
        WebElement folioDePagoColumn = driver.findElement(By.cssSelector("SELECTOR_DE_FOLIO_DE_PAGO"));
        WebElement folioPreSolicitudColumn = driver.findElement(By.cssSelector("SELECTOR_DE_FOLIO_PRE_SOLICITUD"));
        return folioDePagoColumn.getLocation().getX() > folioPreSolicitudColumn.getLocation().getX();
    }

    public boolean isFolioDePagoInitiallyEmpty() {
        WebElement folioDePagoValue = driver.findElement(By.cssSelector("SELECTOR_DE_VALORES_DE_FOLIO_DE_PAGO"));
        return folioDePagoValue.getText().isEmpty();
    }
}