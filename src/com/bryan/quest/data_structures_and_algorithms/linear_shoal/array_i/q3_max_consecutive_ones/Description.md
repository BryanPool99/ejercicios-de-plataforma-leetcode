# 485. Máximo de 1s Consecutivos (Max Consecutive Ones)

## Descripción del Problema
Dado un arreglo binario `nums`, devuelve el número máximo de **1s** consecutivos en el arreglo.

**Retorno:** Un entero que representa la racha más larga de números uno.

---

## Ejemplos

### Ejemplo 1:
**Entrada:** `nums = [1, 1, 0, 1, 1, 1]`  
**Salida:** `3`  
**Explicación:** Los primeros dos dígitos o los últimos tres dígitos son 1s consecutivos. El número máximo de 1s consecutivos es 3.

### Ejemplo 2:
**Entrada:** `nums = [1, 0, 1, 1, 0, 1]`  
**Salida:** `2`

---

## Restricciones
* `1 <= nums.length <= 10^5`
* `nums[i]` es o bien `0` o `1`.