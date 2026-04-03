#  Concatenación de Arreglos (Concatenation of Array)

## Descripción del Problema
Dado un arreglo de enteros `nums` de longitud `n`, debes crear un arreglo `ans` de longitud `2n` donde `ans[i] == nums[i]` y `ans[i + n] == nums[i]` para `0 <= i < n` (indexado desde 0).

Específicamente, `ans` es la concatenación de dos arreglos `nums`.

**Retorno:** El arreglo `ans`.

---

## Ejemplos

### Ejemplo 1:
**Entrada:** `nums = [1, 2, 1]`  
**Salida:** `[1, 2, 1, 1, 2, 1]`  
**Explicación:** El arreglo `ans` se forma de la siguiente manera:
- `ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]`
- `ans = [1, 2, 1, 1, 2, 1]`

### Ejemplo 2:
**Entrada:** `nums = [1, 3, 2, 1]`  
**Salida:** `[1, 3, 2, 1, 1, 3, 2, 1]`  
**Explicación:** El arreglo `ans` se forma de la siguiente manera:
- `ans = [nums[0], nums[1], nums[2], nums[3], nums[0], nums[1], nums[2], nums[3]]`
- `ans = [1, 3, 2, 1, 1, 3, 2, 1]`

---

## Restricciones
* `n == nums.length`
* `1 <= n <= 1000`
* `1 <= nums[i] <= 1000`
