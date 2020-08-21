package com.br.mastertech.usuario.controller;

import com.br.mastertech.usuario.dto.UsuarioMapper;
import com.br.mastertech.usuario.dto.request.UsuarioRequest;
import com.br.mastertech.usuario.dto.response.UsuarioResponse;
import com.br.mastertech.usuario.models.Usuario;
import com.br.mastertech.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioMapper usuarioMapper;

	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponse cadastrarCliente(@RequestBody UsuarioRequest usuarioRequest) {
		Usuario usuario = usuarioMapper.toUsuario(usuarioRequest);
		usuario = usuarioService.cadastrar(usuario);
		return usuarioMapper.toClienteResponse(usuario);
	}
	
}
