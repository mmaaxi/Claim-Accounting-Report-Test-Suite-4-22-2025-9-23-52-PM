Feature: Validar cálculo en 'Monto acumulado Folio Reserva 5401'

  Scenario: Calcular monto acumulado de reserva
    Given el usuario está en la página de reservas
    When el usuario inserta un monto de reserva anterior de "100" en la fila 1
    And el usuario inserta un monto actual de "150" en la fila 2
    Then los valores se muestran en las celdas correspondientes
    And el monto acumulado es 250 y se actualiza en la columna de monto acumulado