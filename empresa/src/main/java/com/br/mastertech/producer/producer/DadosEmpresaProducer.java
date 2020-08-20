package com.br.mastertech.producer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DadosEmpresaProducer {

    @Autowired
    private KafkaTemplate<String, DadosEmpresa> producer;

    public void enviarAoKafka(DadosEmpresa dadosEmpresa) {

        producer.send("sspec4-renato-prata-1", dadosEmpresa);
        producer.send("spec4-renato-prata-2", dadosEmpresa);
        producer.send("spec4-renato-prata-3", dadosEmpresa);

    }


}
