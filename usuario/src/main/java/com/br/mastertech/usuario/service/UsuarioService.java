package com.br.mastertech.usuario.service;


import com.br.mastertech.usuario.client.CepDTO;
import com.br.mastertech.usuario.client.ClientCep;
import com.br.mastertech.usuario.models.Usuario;
import com.br.mastertech.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	ClientCep clientCep;

	public Usuario cadastrar(Usuario usuario) {
		CepDTO cepDTO = null;

		cepDTO = clientCep.buscaCep(usuario.getCep());

		usuario.setLogradouro(cepDTO.getLogradouro());
		usuario.setBairro(cepDTO.getBairro());

		usuario = usuarioRepository.save(usuario);

        return usuario;
	}

}
