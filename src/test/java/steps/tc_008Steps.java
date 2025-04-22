package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;

import static org.junit.Assert.assertEquals;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page tc_008Page;

    @Given("El usuario está en la sección de movimiento de pago")
    public void el_usuario_esta_en_la_seccion_de_movimiento_de_pago() {
        driver = // Inicializa el driver según tu configuración
        tc_008Page = PageFactory.initElements(driver, tc_008Page.class);
        tc_008Page.navigateToPagoMovimiento();
    }

    @When("El usuario revisa la fórmula en la celda del Monto Acumulado")
    public void el_usuario_revisa_la_formula_en_la_celda_del_monto_acumulado() {
        tc_008Page.checkFormula();
    }

    @Then("La fórmula debe ser {string}")
    public void la_formula_debe_ser(String expectedFormula) {
        assertEquals(expectedFormula, tc_008Page.getCellFormula());
    }

    @When("El usuario introduce datos simulados de descuentos, IVA descuento, ISR,")
    public void el_usuario_introduce_datos_simulados(io.cucumber.datatable.DataTable dataTable) {
        tc_008Page.fillSimulationData(dataTable);
    }

    @Then("El resultado debe reflejar la suma correcta de {int}")
    public void el_resultado_debe_reflejar_la_suma_correcta_de(int expectedSum) {
        assertEquals(expectedSum, tc_008Page.calculateAccumulatedAmount());
    }
}