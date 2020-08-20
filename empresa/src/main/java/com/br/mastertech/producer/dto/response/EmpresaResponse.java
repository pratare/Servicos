package com.br.mastertech.producer.dto.response;

public class EmpresaResponse {

	private String CNPJ;

    private String name;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
