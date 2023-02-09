## AeroDescuentos

# 1

   - Si los días de antelación son negativos.
   - Si la edad es negativa.
   - Si la edad es mayor a 120.
   - Si la tarifa base es negativa.

# 2

   | Número | Clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | Días negativos | Incorrecto |
   | 2 | Días mayores a 0 | Correcto |
   | 3 | Edad negativa o igual a cero | Incorrecto |
   | 4 | Edad mayor a 0 y menor a 121 | Correcto |
   | 5 | Edad mayor a 120 | Incorrecto |
   | 6 | Tarifa base negativa | Incorrecto |
   | 7 | Tarifa base mayor a cero | Correcto |

# 3

   | Número | Ejemplo clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(1000000, -20, 20) | Incorrecto |
   | 2 | calculoTarifa(1500000, 40, 18) | Correcto |
   | 3 | calculoTarifa(2000000, 10, -10) | Incorrecto |
   | 4 | calculoTarifa(3000000, 50, 15) | Correcto |
   | 5 | calculoTarifa(3600000, 150, 15) | Incorrecto |
   | 6 | calculoTarifa(-1000000, 3, 43) | Incorrecto |
   | 7 | calculoTarifa(2000000, 18, 78) | Correcto |

# 4

   - La frontera de los días es 0
   - La frontera de la edad es 1 y 120
   - La frontera de la tarifa es 0
 
# 5

   | Número | Ejemplo Frontera | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(1000000, 0, 30) | Correcto |
   | 2 | calculoTarifa(3000000, 34, 1) | Correcto |
   | 3 | calculoTarifa(2000000, 80, 120) | Correcto |
   | 4 | calculoTarifa(0, 24, 45) | Correcto |