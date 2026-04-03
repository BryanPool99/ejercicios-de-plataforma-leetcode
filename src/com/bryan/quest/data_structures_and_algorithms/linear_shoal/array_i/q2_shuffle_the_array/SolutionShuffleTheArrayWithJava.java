package com.bryan.quest.data_structures_and_algorithms.linear_shoal.array_i.q2_shuffle_the_array;

import java.util.Arrays;

public class SolutionShuffleTheArrayWithJava {
    public static int[] shuffle(int[] nums, int n) {
        // Inicializamos el arreglo resultante con el tamaño total (2n)
        int[] result = new int[2 * n];
        // Solo necesitamos iterar hasta n, ya que en cada paso colocamos dos elementos
        for (int i = 0; i < n; i++) {
            // Colocamos el elemento x_i en las posiciones pares (0, 2, 4...)
            result[2 * i] = nums[i];
            // Colocamos el elemento y_i en las posiciones impares (1, 3, 5...)
            // El elemento y_i se encuentra desplazado 'n' posiciones en el arreglo original
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
