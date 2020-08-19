package com.br.mastertech.acesso.client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client", configuration = ClienteClientConfiguration.class)
public interface ClientCliente {

    @GetMapping("/cliente/{id}")
    public ClienteDTO buscaById(@PathVariable Integer id);

}
