package com.br.mastertech.fatura.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CARTAO", configuration = FaturaClientConfiguration.class)
public interface ClientCartao {

    @GetMapping("/cartoes/{id}")
    public PagamentoDTO buscaById(@PathVariable Integer id_cartao);
}
