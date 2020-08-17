package com.br.mastertech.cartao.client;

import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class CartaoClientConfiguration {

    @Bean
    public ErrorDecoder getClientNotFound(){
        return new CartaoClientDecoder();
    }

    @Bean
    public Feign.Builder builder() {
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new ClienteClientFallback(), RetryableException.class)
                .build();

        return Resilience4jFeign.builder(decorators);
    }


}
