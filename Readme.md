# AeroDescuentos

1)
   - Si los días de antelación son negativos.
   - Si la edad es negativa.
   - Si la tarifa base es negativa
2)
   | Número | Clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | Días negativos | Incorrecto |
   | 2 | Días igual a 0 | Correcto |
   | 3 | Días mayores a 0 | Correcto |
   | 4 | Edad negativa o igual a cero | Incorrecto |
   | 5 | Edad igual a 1 | Correcto |
   | 6 | Edad mayor a 0 | Correcto |
   | 7 | tarifa base negativa | Incorrecto |
   | 8 | tarifa base igual a cero| Correcto |
   | 9 | tarifa base mayor a cero | Correcto |
3)
   | Número | Ejemplo clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(1000000, -20, 20) | Incorrecto |
   | 2 | calculoTarifa(1000000, 0, 30) | Correcto |
   | 3 | calculoTarifa(1000000, 40, 18) | Correcto |
   | 4 | calculoTarifa(1000000, 10, -10) | Incorrecto |
   | 5 | calculoTarifa(1000000, 0, 1) | Correcto |
   | 6 | calculoTarifa(1000000, 50, 15) | Correcto |
   | 7 | calculoTarifa(-1000000, 3, 43) | Incorrecto |
   | 8 | calculoTarifa(0, 24, 45) | Correcto |
   | 9 | calculoTarifa(2000000, 18, 78) | Correcto |
4)