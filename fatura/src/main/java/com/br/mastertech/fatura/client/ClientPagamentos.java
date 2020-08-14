package com.br.mastertech.fatura.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PAGAMENTO")
public interface ClientPagamentos {

    @GetMapping("/pagamento/{id_cartao}")
    public List<PagamentoDTO> buscaById(@PathVariable Integer id_cartao);

}
