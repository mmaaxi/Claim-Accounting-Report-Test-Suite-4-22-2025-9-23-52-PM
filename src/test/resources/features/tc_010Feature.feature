Feature: Validar inclusión y renombrado de columnas de estado de pago

Scenario: Verificar columnas de estado de pago
  Given el usuario está en la página de tabla de pagos
  When la columna "Status Pago Código" se encuentra a la derecha de "Fecha de Pago"
  Then la columna "Status Pago Código" existe en la ubicación especificada sin datos iniciales

Scenario: Confirmar renombrado de columna de estado de pago
  Given el usuario está en la página de tabla de pagos
  When la columna "Status de Pago" ha sido renombrada
  Then el encabezado se muestra correctamente como "Descripción Status Pago"