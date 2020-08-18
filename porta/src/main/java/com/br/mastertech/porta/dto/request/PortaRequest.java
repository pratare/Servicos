package com.br.mastertech.porta.dto.request;


public class PortaRequest {

    private String sala;

    private Integer andar;

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }
}
