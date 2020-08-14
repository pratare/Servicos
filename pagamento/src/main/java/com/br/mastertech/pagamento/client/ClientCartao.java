package com.br.mastertech.pagamento.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cartao", configuration = PagamentoClientConfiguration.class)
public interface ClientCartao {

	@GetMapping("/cartao/cartoes/{id}")
	public CartaoDTO buscaById(@PathVariable Integer id);

}
