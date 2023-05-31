package com.mycompany.exercicio9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author aluno
 */
public class ValidadorEmail implements Validavel {

    /**
     *
     * @param email
     */
    @Override
    public void validar(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("O e-mail é válido");
        } else {
            System.out.println("O e-mail é inválido");
        }
    }

}
