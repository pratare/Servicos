package com.br.mastertech.porta.models;

import javax.persistence.*;

@Entity
@Table
public class Porta {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String sala;

	@Column
	private Integer andar;

	public Porta() {
		
	}
	
//	public Porta(String name) {
//		super();
//		this.name = name;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
