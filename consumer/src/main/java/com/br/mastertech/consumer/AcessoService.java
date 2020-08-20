package com.br.mastertech.consumer;

import com.br.mastertech.acesso.producer.LogAcesso;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;

@Service
public class AcessoService {
	
    Logger logger = LoggerFactory.getLogger(AcessoService.class);

	
	public void criaEventoLog(LogAcesso logAcesso) {
		
		try {
			BufferedWriter writer =  new BufferedWriter(new FileWriter("./log-acesso.csv", true));
			
			CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
	         		
			 csvPrinter.printRecord(
					 logAcesso.getClienteId().toString(),
					 logAcesso.getPortaId().toString(),
					 logAcesso.possuiAcesso().toString());
	         csvPrinter.flush();  
	         csvPrinter.close();
		}catch(Exception e) {
			logger.error("Erro ao criar evento", e);
		}
		 

	}

}
