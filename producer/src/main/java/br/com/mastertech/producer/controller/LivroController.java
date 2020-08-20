package br.com.mastertech.producer.controller;

import br.com.mastertech.producer.producer.Livro;
import br.com.mastertech.producer.producer.LivroProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroProducer livroProducer;

    @PostMapping
    public void sendLivro(@RequestBody Livro livro) {
        livroProducer.enviarAoKafka(livro);
    }


}
