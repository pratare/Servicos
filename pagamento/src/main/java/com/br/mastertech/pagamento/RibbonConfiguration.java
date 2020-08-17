package com.br.mastertech.pagamento;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {

    @Bean
    public IRule getIRule(){
        return new WeightedResponseTimeRule();
    }
}
