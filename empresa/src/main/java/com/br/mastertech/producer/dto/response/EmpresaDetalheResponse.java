package com.br.mastertech.producer.dto.response;

public class EmpresaDetalheResponse {

    private String name;

    private String CNPJ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
