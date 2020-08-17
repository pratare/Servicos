package com.br.mastertech.fatura.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class FaturaClientConfiguration {

    @Bean
    public ErrorDecoder getFaturaNotFound(){
        return new FaturaClientDecoder();
    }

}
