package com.br.mastertech.usuario.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep", configuration = CepClientConfiguration.class)
public interface ClientCep {

    @GetMapping("/cep/{cep}")
    public CepDTO buscaCep(@PathVariable String cep);

}
