package com.br.mastertech.acesso.dto;

import com.br.mastertech.acesso.dto.request.AcessoRequest;
import com.br.mastertech.acesso.dto.response.AcessoResponse;
import com.br.mastertech.acesso.models.Acesso;
import org.springframework.stereotype.Component;

@Component
public class AcessoMapper {
	
	public Acesso toAcesso(AcessoRequest acessoRequest) {
		Acesso acesso = new Acesso();
		acesso.setClienteId(acessoRequest.getClienteId());
		acesso.setPortaId(acessoRequest.getPortaId());
		return acesso;
	}

	public AcessoResponse toAcessoResponse(Acesso acesso) {
		AcessoResponse acessoResponse = new AcessoResponse();
		acessoResponse.setPortaId(acesso.getPortaId());
		acessoResponse.setClienteId(acesso.getClienteId());
		
		return acessoResponse;
		
	}

	public Acesso toAcessoApagar(Integer client_id, Integer porta_id) {
		Acesso acesso = new Acesso();
		acesso.setPortaId(porta_id);
		acesso.setClienteId(client_id);

		return acesso;
	}

	public Acesso toAcessoDetalhe(Integer client_id, Integer porta_id) {
		Acesso acesso = new Acesso();
		acesso.setPortaId(porta_id);
		acesso.setClienteId(client_id);

		return acesso;
	}

	
}
