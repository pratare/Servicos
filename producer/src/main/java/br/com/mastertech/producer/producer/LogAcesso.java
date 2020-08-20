package br.com.mastertech.producer.producer;

public class LogAcesso {

    private boolean possuiAcesso;

    private Integer porta;

    private String cliente;

    public boolean isPossuiAcesso() {
        return possuiAcesso;
    }

    public void setPossuiAcesso(boolean possuiAcesso) {
        this.possuiAcesso = possuiAcesso;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
