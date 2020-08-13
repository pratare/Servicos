package com.br.mastertech.pagamento.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Pagamento {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String descricao;

    @Column
    private BigDecimal valor;

    @Column
    private Integer cartaoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getCartaoid() {
		return cartaoId;
	}

	public void setCartaoid(Integer cartaoId) {
		this.cartaoId = cartaoId;
	}
	
}
