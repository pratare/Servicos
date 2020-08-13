package com.br.mastertech.pagamento.repository;

import com.br.mastertech.pagamento.models.Pagamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {


	 List<Pagamento> findAllByCartaoId(Integer cartaoId);
	 
}
