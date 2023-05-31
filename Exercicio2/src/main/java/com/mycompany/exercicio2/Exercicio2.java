/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
     
        Ordenavel bolha = new BubbleSort();
        
        int [] numeros = {45,65,12,40,87,55,22,8};
        bolha.ordenar(numeros);
        
        System.out.println("Ordenacao:");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(" - " + numeros[i]);
        }
    }
}
