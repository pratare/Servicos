package com.br.mastertech.cartao.repository;


import com.br.mastertech.cartao.models.Cartao;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartaoRepository extends CrudRepository<Cartao, Integer> {
	
	Optional<Cartao> getByNumeroCartao(String numero);

}
