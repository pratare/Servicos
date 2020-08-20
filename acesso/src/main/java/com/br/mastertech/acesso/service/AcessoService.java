package com.br.mastertech.acesso.service;

import com.br.mastertech.acesso.client.cliente.ClientCliente;
import com.br.mastertech.acesso.client.porta.ClientPorta;
import com.br.mastertech.acesso.client.cliente.ClienteDTO;
import com.br.mastertech.acesso.client.porta.PortaDTO;
import com.br.mastertech.acesso.models.Acesso;
import com.br.mastertech.acesso.producer.LogAcesso;
import com.br.mastertech.acesso.producer.LogAcessoProducer;
import com.br.mastertech.acesso.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Component
public class AcessoService {
	
	@Autowired
	AcessoRepository acessoRepository;
	
	@Autowired
	ClientPorta clientPorta;

	@Autowired
	ClientCliente clientCliente;

	@Autowired
	LogAcessoProducer logAcessoProducer;

	public Acesso criarAcesso(Acesso acesso) {
		PortaDTO portaDTO = null;
		ClienteDTO clienteDTO = null;

		portaDTO = clientPorta.buscaById(acesso.getPortaId());

		clienteDTO = clientCliente.buscaById(acesso.getClienteId());

		acesso = acessoRepository.save(acesso);

		return acesso;
		 
	}

	@Transactional
	public void apagarAcesso(Acesso acesso) {
		PortaDTO portaDTO = null;
		ClienteDTO clienteDTO = null;

		portaDTO = clientPorta.buscaById(acesso.getPortaId());

		clienteDTO = clientCliente.buscaById(acesso.getClienteId());

		acessoRepository.removeAllByClienteIdAndPortaId(acesso.getClienteId(), acesso.getPortaId());
	}

	public Acesso consultaAcesso(Acesso acesso) {
		PortaDTO portaDTO = null;
		ClienteDTO clienteDTO = null;
		LogAcesso logAcesso = new LogAcesso();

		if(acesso.getClienteId() != 8){
			logAcesso.setPossuiAcesso(Boolean.TRUE);
			logAcesso.setClienteId(acesso.getClienteId());
			logAcesso.setPortaId(acesso.getPortaId());
		}else{
			logAcesso.setPossuiAcesso(Boolean.FALSE);
			logAcesso.setClienteId(acesso.getClienteId());
			logAcesso.setPortaId(acesso.getPortaId());
		}
		logAcessoProducer.enviarAoKafka(logAcesso);

		portaDTO = clientPorta.buscaById(acesso.getPortaId());

		clienteDTO = clientCliente.buscaById(acesso.getClienteId());

		acessoRepository.findAllByClienteIdAndPortaId(acesso.getClienteId(), acesso.getClienteId());

		return acesso;

	}
	
}
