package com.br.mastertech.cartao.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENTE", configuration = CartaoClientConfiguration.class)
public interface ClientCliente {

    @GetMapping("/cliente/{id}")
    Cliente getClienteById(@PathVariable int id);

}
