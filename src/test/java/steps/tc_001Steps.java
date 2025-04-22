package steps;

import pages.tc_001Page;
import io.cucumber.java.en.*;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("estoy en la hoja de cálculo con los datos requeridos")
    public void estoy_en_la_hoja_de_calculo_con_los_datos_requeridos() {
        page.abrirHojaDeCalculo();
    }

    @When("extraigo los campos: \"Número de Siniestro\", \"Número de Autorización\", \"status\", \"tipo de movimiento\", y \"número de movimiento\"")
    public void extraigo_los_campos() {
        page.extraerCampos();
    }

    @Then("se obtienen los campos necesarios para la concatenación")
    public void se_obtienen_los_campos_necesarios() {
        page.verificarExtraccionCampos();
    }

    @When("aplico la fórmula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2) en la Columna C")
    public void aplico_la_formula_concatenate() {
        page.aplicarFormulaConcatenate();
    }

    @Then("la llave generada respeta el orden y la separación indicada")
    public void la_llave_generada_respeta_el_orden() {
        page.verificarLlaveGenerada();
    }
}