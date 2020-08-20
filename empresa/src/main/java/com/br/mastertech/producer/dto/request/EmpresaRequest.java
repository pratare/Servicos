package com.br.mastertech.producer.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EmpresaRequest {

    @NotBlank
    @Size(min = 3)
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
