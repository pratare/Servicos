package com.br.mastertech.pagamento.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class PagamentoClientConfiguration {

    @Bean
    public ErrorDecoder getCartaoNotFound(){
        return new PagamentoClientDecoder();
    }
}
