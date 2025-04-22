package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_009Page;

import static org.junit.Assert.assertTrue;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page;

    public tc_009Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_009Page.class);
    }

    @Given("El usuario está en la tabla de solicitudes")
    public void el_usuario_esta_en_la_tabla_de_solicitudes() {
        driver.get("URL_DE_LA_TABLA_DE_SOLICITUDES");
    }

    @When("El usuario verifica la columna 'Folio Pre solicitud'")
    public void el_usuario_verifica_la_columna_folio_pre_solicitud() {
        assertTrue(page.isFolioPreSolicitudVisible());
    }

    @Then("La columna 'Folio Pre solicitud' está junto a la columna 'Ramo' y sin valores")
    public void la_columna_folio_pre_solicitud_esta_junto_a_la_columna_ramo_y_sin_valores() {
        assertTrue(page.isFolioPreSolicitudPositionedCorrectly());
        assertTrue(page.isFolioPreSolicitudInitiallyEmpty());
    }

    @When("El usuario verifica la columna 'Folio de Pago'")
    public void el_usuario_verifica_la_columna_folio_de_pago() {
        assertTrue(page.isFolioDePagoVisible());
    }

    @Then("La columna 'Folio de Pago' está a la derecha de 'Folio Pre solicitud' y sin datos")
    public void la_columna_folio_de_pago_esta_a_la_derecha_de_folio_pre_solicitud_y_sin_datos() {
        assertTrue(page.isFolioDePagoPositionedCorrectly());
        assertTrue(page.isFolioDePagoInitiallyEmpty());
    }
}