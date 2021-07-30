package br.com.fcamara.Contatos.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorTelefoneService {

    public static void validar(String nome, String telefone) {
        Pattern pattern = Pattern.compile("^((\\(\\d{2}\\))|\\d{2})[- .]?\\d{5}[- .]?\\d{4}$");
        Matcher matcher = pattern.matcher(telefone);
        if(!matcher.matches()) {
            throw new IllegalArgumentException("Telefone Invalido");
        }

    }

}
