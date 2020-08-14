package com.br.mastertech.fatura.dto.request;

import java.math.BigDecimal;
import java.util.Date;

public class FaturaRequest {

    private Integer id;
    
    private BigDecimal valorPago;
    
    private Date pagoEm;

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
    
}
