
package com.mycompany.exercicio5;

/**
 *
 * @author aluno
 */
public class RegistroConsole implements Registravel{

    @Override
    public void registrar(String mensagem){
        System.out.println("Novo login registrado\n");
    }
}