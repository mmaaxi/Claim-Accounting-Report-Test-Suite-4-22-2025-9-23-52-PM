package steps;

import io.cucumber.java.en.*;
import pages.tc_004Page;
import static org.junit.Assert.assertEquals;

public class tc_004Steps {

    tc_004Page reservaPage = new tc_004Page();

    @Given("el usuario está en la página de reservas")
    public void el_usuario_está_en_la_página_de_reservas() {
        reservaPage.navegarAPaginaDeReservas();
    }

    @When("el usuario inserta un monto de reserva anterior de {string} en la fila 1")
    public void el_usuario_inserta_un_monto_de_reserva_anterior_en_la_fila1(String montoAnterior) {
        reservaPage.insertarMontoAnterior(montoAnterior);
    }

    @When("el usuario inserta un monto actual de {string} en la fila 2")
    public void el_usuario_inserta_un_monto_actual_en_la_fila2(String montoActual) {
        reservaPage.insertarMontoActual(montoActual);
    }

    @Then("los valores se muestran en las celdas correspondientes")
    public void los_valores_se_muestran_en_las_celdas_correspondientes() {
        assertEquals("100", reservaPage.obtenerMontoAnterior());
        assertEquals("150", reservaPage.obtenerMontoActual());
    }

    @Then("el monto acumulado es 250 y se actualiza en la columna de monto acumulado")
    public void el_monto_acumulado_es_y_se_actualiza_en_la_columna_de_monto_acumulado() {
        assertEquals(250, reservaPage.obtenerMontoAcumulado());
    }
}