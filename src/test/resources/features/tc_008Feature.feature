Feature: Validar fórmula en 'Monto Acumulado Folio OPC (2121)' en movimiento de pago

  Scenario: Validar fórmula correcta y sumas de componentes con datos simulados
    Given El usuario está en la sección de movimiento de pago
    When El usuario revisa la fórmula en la celda del Monto Acumulado
    Then La fórmula debe ser "Z4+AD5+AE5+AH5+AC5+AB5+AM5"
    
    When El usuario introduce datos simulados de descuentos, IVA descuento, ISR, 
    | componente   | valor |
    | Z4           | 100   |
    | AD5          | 50    |
    | AE5          | 20    |
    | AH5          | 5     |
    | AC5          | 10    |
    | AB5          | 15    |
    | AM5          | 0     |
    
    Then El resultado debe reflejar la suma correcta de 200