package com.br.mastertech.fatura.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private BigDecimal valorPago;

    @Column
    private Date pagoEm;

    @Column
    private String status;

    @Column
    private Integer cartaoId;

    @Column
    private String descricao;

    @Column
    private BigDecimal valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public Date getPagoEm() {
        return pagoEm;
    }

    public void setPagoEm(Date pagoEm) {
        this.pagoEm = pagoEm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(Integer cartaoId) {
        this.cartaoId = cartaoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
