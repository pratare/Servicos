package com.br.mastertech.acesso.controller;

import com.br.mastertech.acesso.dto.AcessoMapper;
import com.br.mastertech.acesso.dto.request.AcessoRequest;
import com.br.mastertech.acesso.dto.response.AcessoResponse;
import com.br.mastertech.acesso.models.Acesso;
import com.br.mastertech.acesso.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acesso")
public class AcessoController {

	@Autowired
	AcessoService acessoService;
	
	@Autowired
	AcessoMapper acessoMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AcessoResponse criarAcesso(@RequestBody AcessoRequest acessoRequest) {
		Acesso acesso = acessoMapper.toAcesso(acessoRequest);
		acesso = acessoService.criarAcesso(acesso);
		
		return acessoMapper.toAcessoResponse(acesso);
	}
	
	@GetMapping("/{cliente_id}/{porta_id}")
	public AcessoResponse listarAcesso(@PathVariable Integer cliente_id, Integer porta_id) {
		Acesso acesso = acessoMapper.toAcessoDetalhe(cliente_id, porta_id);
		acesso = acessoService.consultaAcesso(acesso);

		return acessoMapper.toAcessoResponse(acesso);

    }

    @DeleteMapping("/{clientid}/{portaid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarAcesso(@PathVariable Integer clientid, @PathVariable Integer portaid) {
		Acesso acesso = acessoMapper.toAcessoApagar(clientid, portaid);
		acessoService.apagarAcesso(acesso);
	}
}