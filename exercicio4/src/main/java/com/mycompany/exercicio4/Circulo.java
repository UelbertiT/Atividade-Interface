package com.mycompany.exercicio4;





/**
 *
 * @author aluno
 */
public class Circulo implements Redimensionavel {
    
    /**
     *
     * @param fator
     */
    @Override
    public void redimensionar (double fator){
        System.out.println("Redimensionado  \n o raio pelo fator" + fator);
    }
}
