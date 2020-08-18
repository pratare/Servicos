package com.br.mastertech.acesso.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "porta", configuration = AcessoClientConfiguration.class)
public interface ClientPorta {

	@GetMapping("/porta/{id}")
	public PortaDTO buscaById(@PathVariable Integer id);

}
