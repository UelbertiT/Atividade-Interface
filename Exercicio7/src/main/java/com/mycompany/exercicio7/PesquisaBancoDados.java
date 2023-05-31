/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio7;

/**
 *
 * @author aluno
 */
public class PesquisaBancoDados implements Pesquisavel{
    String[] bancoDados = {"uelberti", "Matheus", "Gabriela", "Pedro"};
    
    @Override
    public void pesquisar(String palavraChave){
        for(int i = 0; i < bancoDados.length; i++){
            if(palavraChave == null ? bancoDados[i] == null : palavraChave.equals(bancoDados[i])){
                System.out.println("Palavra encontrada: " + i);
                break;
            }
        }
    }
}
