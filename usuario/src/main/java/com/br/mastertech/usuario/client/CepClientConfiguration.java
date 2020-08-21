package com.br.mastertech.usuario.client;

import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class CepClientConfiguration {

    @Bean
    public ErrorDecoder getClientNotFound(){
        return new CepClientDecoder();
    }

    @Bean
    public Feign.Builder builder() {
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new CepClientFallback(), RetryableException.class)
                .build();

        return Resilience4jFeign.builder(decorators);
    }
}
