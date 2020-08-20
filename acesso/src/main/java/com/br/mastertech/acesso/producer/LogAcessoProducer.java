package com.br.mastertech.acesso.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogAcessoProducer {

    @Autowired
    private KafkaTemplate<String, LogAcesso> producer;

    public void enviarAoKafka(LogAcesso logAcesso) {

        producer.send("spec4-renato-prata-1", logAcesso);
        producer.send("spec4-renato-prata-2", logAcesso);
        producer.send("spec4-renato-prata-3", logAcesso);

    }


}
