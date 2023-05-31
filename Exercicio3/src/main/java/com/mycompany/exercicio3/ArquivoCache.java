package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ArquivoCache implements Armazenavel{

    /**
     *
     */
    @Override
    public void Salvan(){
        System.out.println("Dados Salvados");
    }
    @Override
    public void Carregar(){
        System.out.println("Caregando dados");
    }
}
