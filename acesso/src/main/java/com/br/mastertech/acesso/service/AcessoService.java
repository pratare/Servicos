package com.br.mastertech.acesso.service;

import com.br.mastertech.acesso.client.ClientCliente;
import com.br.mastertech.acesso.client.ClientPorta;
import com.br.mastertech.acesso.client.ClienteDTO;
import com.br.mastertech.acesso.client.PortaDTO;
import com.br.mastertech.acesso.models.Acesso;
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

		portaDTO = clientPorta.buscaById(acesso.getPortaId());

		clienteDTO = clientCliente.buscaById(acesso.getClienteId());

		acessoRepository.findAllByClienteIdAndPortaId(acesso.getClienteId(), acesso.getClienteId());

		return acesso;

	}
	
}
