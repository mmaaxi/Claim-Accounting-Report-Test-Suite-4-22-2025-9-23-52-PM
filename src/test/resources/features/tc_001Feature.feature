Feature: Validar generación y orden de la llave concatenada

  Scenario: Validar la extracción y concatenación de campos para la generación de la llave
    Given estoy en la hoja de cálculo con los datos requeridos
    When extraigo los campos: "Número de Siniestro", "Número de Autorización", "status", "tipo de movimiento", y "número de movimiento"
    Then se obtienen los campos necesarios para la concatenación
    When aplico la fórmula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2) en la Columna C
    Then la llave generada respeta el orden y la separación indicada