package com.br.mastertech.acesso.client.cliente;

import com.br.mastertech.acesso.client.porta.PortaClientFallback;
import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class ClienteClientConfiguration {

    @Bean
    public ErrorDecoder getClientNotFound(){
        return new ClienteClientDecoder();
    }

    @Bean
    public Feign.Builder builder() {
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new PortaClientFallback(), RetryableException.class)
                .build();

        return Resilience4jFeign.builder(decorators);
    }
}
