package com.mycompany.exercicio6;

/**
 *
 * @author aluno
 */
public interface Criptografavel {
    byte[] criptografar(String dados);
    String descriptrografar(byte[] dadosCriptografados);
}