package com.br.mastertech.cartao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String numero;
	
	private boolean ativo;

	private Integer clienteId;
	
	public Cartao() {
		
	}

	public Cartao(String numero) {
		super();
		this.numero = numero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
}
