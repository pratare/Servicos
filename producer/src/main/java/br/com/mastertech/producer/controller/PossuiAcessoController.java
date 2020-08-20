package br.com.mastertech.producer.controller;

import br.com.mastertech.producer.producer.Livro;
import br.com.mastertech.producer.producer.LogAcesso;
import br.com.mastertech.producer.producer.LogAcessoProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PossuiAcessoController {

    @Autowired
    LogAcessoProducer logAcessoProducer;

    @GetMapping("/{cliente}/{porta}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void possuiAcesso(@PathVariable String cliente,@PathVariable String porta) {
        LogAcesso logAcesso = new LogAcesso();
        if (porta != null) {
            logAcesso.setPossuiAcesso(Boolean.TRUE);
        }else{
        logAcesso.setPossuiAcesso(Boolean.FALSE);
    }
		logAcessoProducer.enviarAoKafka(logAcesso);
    }


}
