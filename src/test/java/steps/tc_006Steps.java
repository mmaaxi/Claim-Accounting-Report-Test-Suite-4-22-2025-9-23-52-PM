package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import pages.TC_006Page;

public class tc_006Steps {

    TC_006Page ivasPage = new TC_006Page();

    @Given("el usuario abre el archivo del layout")
    public void abrirArchivoLayout() {
        ivasPage.cargarArchivoLayout();
    }

    @When("el usuario revisa la presencia de la columna {string}")
    public void revisarColumna(String columna) {
        assertTrue(ivasPage.esColumnaPresente(columna));
    }

    @Then("la columna {string} se muestra correctamente")
    public void verificarColumnaMuestraCorrectamente(String columna) {
        assertTrue(ivasPage.esColumnaVisible(columna));
    }

    @Given("el archivo del layout tiene datos para la columna IVA 0%")
    public void archivoLayoutDatosColumnaIva0() {
        assertTrue(ivasPage.tieneDatosColumnaIva0());
    }

    @When("el usuario confirma que los montos aplicados a la tasa 0% se asignen")
    public void confirmarMontosAsignados() {
        assertTrue(ivasPage.montosAsignadosCorrectamente());
    }

    @Then("los montos de IVA al 0% se registran en la columna sin errores")
    public void verificarMontosRegistradosSinErrores() {
        assertTrue(ivasPage.montosRegistradosCorrectamente());
    }
}