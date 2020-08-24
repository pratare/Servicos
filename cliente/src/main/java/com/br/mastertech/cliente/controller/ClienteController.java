package com.br.mastertech.cliente.controller;


import com.br.mastertech.cliente.dto.ClienteMapper;
import com.br.mastertech.cliente.dto.request.ClienteRequest;
import com.br.mastertech.cliente.dto.response.ClienteDetalheResponse;
import com.br.mastertech.cliente.dto.response.ClienteResponse;
import com.br.mastertech.cliente.models.Cliente;
import com.br.mastertech.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ClienteMapper clienteMapper;
	
	@GetMapping("/{id}")
	public ClienteDetalheResponse exibeCliente(@PathVariable int id, Principal principal) {

		System.out.println(">>>>>>>>>>>>>>>>>>");
		System.out.println(principal.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>");

		Cliente clienteId = clienteService.buscarCliente(id);
        return clienteMapper.toClienteDetalheResponse(clienteId);

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteResponse cadastrarCliente(@RequestBody ClienteRequest clienteRequest) {
		Cliente cliente = clienteMapper.toCliente(clienteRequest);
		cliente = clienteService.cadastrar(cliente);
		return clienteMapper.toClienteResponse(cliente);
	}
	
}
