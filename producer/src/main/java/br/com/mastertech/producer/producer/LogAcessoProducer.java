package br.com.mastertech.producer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class LogAcessoProducer {

    @Autowired
    private KafkaTemplate<String, LogAcesso> producer;

    public void enviarAoKafka(LogAcesso logAcesso) {

        producer.send("sspec4-renato-prata-1", logAcesso);
        producer.send("spec4-renato-prata-2", logAcesso);
        producer.send("spec4-renato-prata-3", logAcesso);

    }


}
