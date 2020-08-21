package com.br.mastertech.contato.service;

import com.br.mastertech.contato.models.Contato;
import com.br.mastertech.contato.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContatoService {
	
	@Autowired
	ContatoRepository contatoRepository;

	public Contato cadastrar(Contato contato) {
		contato = contatoRepository.save(contato);
        return contato;
	}

	public List<Contato> buscarContato(Integer usuarioId) {
		Iterable<Contato> contatos = contatoRepository.findAllByUsuarioId(usuarioId);

		return (List<Contato>) contatos;
	}
}
