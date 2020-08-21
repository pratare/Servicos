package com.br.mastertech.contato.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ContatoRequest {

    @NotBlank
    @Size(min = 3)
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
}
