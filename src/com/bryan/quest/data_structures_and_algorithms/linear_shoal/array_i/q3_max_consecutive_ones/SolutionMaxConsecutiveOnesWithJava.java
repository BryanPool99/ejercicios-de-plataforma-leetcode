package com.bryan.quest.data_structures_and_algorithms.linear_shoal.array_i.q3_max_consecutive_ones;

public class SolutionMaxConsecutiveOnesWithJava {
    public static int findMaxConsecutiveOnes(int[] nums) {
        // Variable para almacenar la racha más larga encontrada hasta el momento
        int maxGlobal = 0;
        // Contador para la racha de unos que estamos procesando actualmente
        int countOnesCurrent = 0;
        // Recorremos el arreglo elemento por elemento (Complejidad O(n))
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                // Si el elemento es 1, incrementamos nuestra racha actual
                countOnesCurrent++;
                // Si la racha actual supera al máximo histórico, actualizamos el máximo
                if (countOnesCurrent > maxGlobal) {
                    maxGlobal = countOnesCurrent;
                }
            } else {
                // Si encontramos un 0, la racha de unos se rompe y reiniciamos el contador
                countOnesCurrent = 0;
            }
        }
        // Retornamos el valor máximo registrado durante  el recorrido
        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
