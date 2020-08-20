package br.com.mastertech.producer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LivroProducer {

    @Autowired
    private KafkaTemplate<String, Livro> producer;

    public void enviarAoKafka(Livro livro) {
//        for (int i = 0; i < 40; i++) {
//            producer.send("spec4-biblioteca", i, "1", livro);
//        }
        producer.send("spec4-biblioteca", livro);
    }

}
