/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio6;

import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Criptografavel cripto = new AESCryptografia();
        
        byte[] textoCriptografado = cripto.criptografar("uelberti");
        System.out.println("Texto Criptografado: " + Arrays.toString(textoCriptografado));
        System.out.println("Text Descriptografado: " + cripto.descriptrografar(textoCriptografado));
    }
    
}