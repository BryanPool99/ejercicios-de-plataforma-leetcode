# Reordenar el Arreglo (Shuffle the Array)

## Descripción del Problema
Dado un arreglo `nums` que consiste en `2n` elementos en la forma `[x1, x2, ..., xn, y1, y2, ..., yn]`.

Debes devolver el arreglo en la forma `[x1, y1, x2, y2, ..., xn, yn]`.

**Retorno:** El arreglo con el nuevo orden intercalado.

---

## Ejemplos

### Ejemplo 1:
**Entrada:** `nums = [2, 5, 1, 3, 4, 7]`, `n = 3`  
**Salida:** `[2, 3, 5, 4, 1, 7]`  
**Explicación:** Como $x_1=2, x_2=5, x_3=1, y_1=3, y_2=4, y_3=7$, entonces la respuesta es `[2, 3, 5, 4, 1, 7]`.

### Ejemplo 2:
**Entrada:** `nums = [1, 2, 3, 4, 4, 3, 2, 1]`, `n = 4`  
**Salida:** `[1, 4, 2, 3, 3, 2, 4, 1]`

### Ejemplo 3:
**Entrada:** `nums = [1, 1, 2, 2]`, `n = 2`  
**Salida:** `[1, 2, 1, 2]`

---

## Restricciones
* `1 <= n <= 500`
* `nums.length == 2n`
* `1 <= nums[i] <= 10^3`