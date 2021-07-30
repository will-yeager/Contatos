package br.com.fcamara.Contatos.util.Builder;

import br.com.fcamara.Contatos.modelo.Contato;

public class ContatoBuilder {

    private Contato contato;
    private String nome;
    private String telefone;

    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ContatoBuilder comTelefone(String nome) {
        this.telefone = telefone;
        return this;
    }

    public Contato criar() {
        return new Contato(nome, telefone);
    }
}
