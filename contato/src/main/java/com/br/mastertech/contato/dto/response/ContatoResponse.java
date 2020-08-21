package com.br.mastertech.contato.dto.response;

public class ContatoResponse {

    private String nome;

    private String telefone;

       public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContatoResponse(String nome, String telefone) {
        super();
		this.nome = nome;
		this.telefone = telefone;
    }
    public ContatoResponse() {
        super();

    }
}
