package com.br.mastertech.consumidorEmpresa.consumer;

import com.br.mastertech.consumidorEmpresa.producer.DadosEmpresa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EmpresaConsumer {
	
    Logger logger = LoggerFactory.getLogger(EmpresaConsumer.class);

	
	@Autowired
	EmpresaConsumerService AcessoService;
	
    @KafkaListener(topics = "spec4-renato-prata-2", groupId = "1")
	public void recebeEmpresa(@Payload DadosEmpresa dadosEmpresa) throws IOException {
    	
    	logger.info("Recebendo evento: " + dadosEmpresa.getCNPJEmpresa());
    	
    	AcessoService.criaEventoLog(dadosEmpresa);
	}

}
