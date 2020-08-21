package com.br.mastertech.cep.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep", url = "https://viacep.com.br/")
public interface CepClient {

    @GetMapping("/ws/{cep}/json/")
    Cep getCep(@PathVariable String cep);
}
