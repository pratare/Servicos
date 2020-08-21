package com.br.mastertech.contato.models;

import javax.persistence.*;

@Entity
@Table
public class Contato {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String nome;
	
	@Column
	private String telefone;

	@Column(name = "usuario_id")
	private Integer usuarioId;


	public Contato() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
}
