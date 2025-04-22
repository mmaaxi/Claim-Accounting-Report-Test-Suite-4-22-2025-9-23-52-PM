Feature: Validar inclusión de las columnas 'Folio Pre solicitud' y 'Folio de Pago'

  Scenario: Verificar la correcta ubicación de las columnas 'Folio Pre solicitud' y 'Folio de Pago'
    Given El usuario está en la tabla de solicitudes
    When El usuario verifica la columna 'Folio Pre solicitud'
    Then La columna 'Folio Pre solicitud' está junto a la columna 'Ramo' y sin valores
    When El usuario verifica la columna 'Folio de Pago'
    Then La columna 'Folio de Pago' está a la derecha de 'Folio Pre solicitud' y sin datos