package com.br.mastertech.acesso.models;

import javax.persistence.*;

@Entity
public class Acesso {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer portaId;

    @Column
    private Integer clienteId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPortaId() {
		return portaId;
	}

	public void setPortaId(Integer portaId) {
		this.portaId = portaId;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

}
