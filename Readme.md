## AeroDescuentos

# 1

   - Si los días de antelación son negativos.
   - Si la edad es negativa.
   - Si la tarifa base es negativa

# 2

   | Número | Clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | Días negativos | Incorrecto |
   | 2 | Días mayores a 0 | Correcto |
   | 3 | Edad negativa o igual a cero | Incorrecto |
   | 4 | Edad mayor a 0 | Correcto |
   | 6 | tarifa base negativa | Incorrecto |
   | 7 | tarifa base mayor a cero | Correcto |

# 3

   | Número | Ejemplo clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(1000000, -20, 20) | Incorrecto |
   | 2 | calculoTarifa(1500000, 40, 18) | Correcto |
   | 3 | calculoTarifa(2000000, 10, -10) | Incorrecto |
   | 4 | calculoTarifa(3000000, 50, 15) | Correcto |
   | 5 | calculoTarifa(-1000000, 3, 43) | Incorrecto |
   | 6 | calculoTarifa(2000000, 18, 78) | Correcto |

# 4

   - La frontera de los días es 0
   - La frontera de la edad es 1
   - La frontera de la tarifa es 0
 
# 5

   | Número | Ejemplo Frontera | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(1000000, 0, 30) | Correcto |
   | 2 | calculoTarifa(3000000, 0, 1) | Correcto |
   | 3 | calculoTarifa(0, 24, 45) | Correcto |