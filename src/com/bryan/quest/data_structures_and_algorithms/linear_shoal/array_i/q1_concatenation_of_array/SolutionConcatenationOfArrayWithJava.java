package com.bryan.quest.data_structures_and_algorithms.linear_shoal.array_i.q1_concatenation_of_array;

import java.util.Arrays;

public class SolutionConcatenationOfArrayWithJava {
    public static int[] getConcatenation(int[] nums) {
        // Almacenamos la longitud original del arreglo
        int len = nums.length;
        // Inicializamos un nuevo arreglo con el doble de capacidad
        int[] result = new int[len * 2];
        // Iteramos sobre el nuevo arreglo para poblarlo
        for(int i = 0; i< len*2;i++){
            if(i>= len){
                // Si superamos el índice original, reiniciamos la posición usando la resta
                // para copiar nuevamente los elementos de 'nums'
                result[i] = nums[i-len];
            }else{
                // Copiamos los elementos originales en la primera mitad
                result[i] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
