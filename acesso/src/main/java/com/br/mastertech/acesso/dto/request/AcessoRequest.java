package com.br.mastertech.acesso.dto.request;

import java.math.BigDecimal;

public class AcessoRequest {

	private Integer clienteId;

	private Integer portaId;

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Integer getPortaId() {
		return portaId;
	}

	public void setPortaId(Integer portaId) {
		this.portaId = portaId;
	}
}
