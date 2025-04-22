Feature: Validar inclusión de la columna 'IVA 0%'

  Scenario: Verificar columna IVA 0% en el layout del archivo
    Given el usuario abre el archivo del layout
    When el usuario revisa la presencia de la columna "IVA 0%" 
    Then la columna "IVA 0%" se muestra correctamente 

  Scenario: Confirmar montos de IVA 0% correctamente asignados
    Given el archivo del layout tiene datos para la columna IVA 0%
    When el usuario confirma que los montos aplicados a la tasa 0% se asignen
    Then los montos de IVA al 0% se registran en la columna sin errores