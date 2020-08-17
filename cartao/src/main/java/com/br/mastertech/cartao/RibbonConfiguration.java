package com.br.mastertech.cartao;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
