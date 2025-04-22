package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el usuario está en la página de tabla de pagos")
    public void el_usuario_esta_en_la_pagina_de_tabla_de_pagos() {
        page.navigateToTablePage();
    }

    @When("la columna {string} se encuentra a la derecha de {string}")
    public void la_columna_se_encuentra_a_la_derecha_de(String columnaDerecha, String columnaReferencia) {
        Assert.assertTrue(page.isColumnOnTheRight(columnaDerecha, columnaReferencia));
    }

    @Then("la columna {string} existe en la ubicación especificada sin datos iniciales")
    public void la_columna_existe_en_la_ubicacion_especificada_sin_datos_iniciales(String columna) {
        Assert.assertTrue(page.isColumnPresentWithoutData(columna));
    }

    @When("la columna {string} ha sido renombrada")
    public void la_columna_ha_sido_renombrada(String columnaOriginal) {
        Assert.assertTrue(page.isColumnRenamed(columnaOriginal, "Descripción Status Pago"));
    }

    @Then("el encabezado se muestra correctamente como {string}")
    public void el_encabezado_se_muestra_correctamente_como(String nuevoEncabezado) {
        Assert.assertTrue(page.isColumnHeaderCorrect(nuevoEncabezado));
    }
}