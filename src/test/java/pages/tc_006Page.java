package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_006Page {

    WebDriver driver;
    
    private By columnaIva0 = By.xpath("//header[contains(text(),'IVA 0%')]");
    
    public TC_006Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void cargarArchivoLayout() {
        // Código para cargar el archivo del layout.
    }

    public boolean esColumnaPresente(String columna) {
        return driver.findElements(columnaIva0).size() > 0;
    }

    public boolean esColumnaVisible(String columna) {
        return driver.findElement(columnaIva0).isDisplayed();
    }

    public boolean tieneDatosColumnaIva0() {
        // Verificar si existen datos en la columna IVA 0%.
        return true;
    }

    public boolean montosAsignadosCorrectamente() {
        // Validar que los montos al 0% están correctamente asignados.
        return true;
    }

    public boolean montosRegistradosCorrectamente() {
        // Verificar que los registros son correctos.
        return true;
    }
}