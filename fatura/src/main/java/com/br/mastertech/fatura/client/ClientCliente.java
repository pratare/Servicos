package com.br.mastertech.fatura.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENTE")
public interface ClientCliente {

    @GetMapping("cliente/{id}")
    public PagamentoDTO buscaByIdCliente(@PathVariable Integer id);

}
