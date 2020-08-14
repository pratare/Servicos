package com.br.mastertech.cartao.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class CartaoClientConfiguration {

    @Bean
    public ErrorDecoder getClientNotFound(){
        return new CartaoClientDecoder();
    }

}
