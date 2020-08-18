package com.br.mastertech.client.service;


import com.br.mastertech.client.exception.UserNotFoundException;
import com.br.mastertech.client.models.Cliente;
import com.br.mastertech.client.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente buscarCliente(Integer id) {
		Optional<Cliente> user = clienteRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException();
		}
		return user.get();
	}

	public Cliente cadastrar(Cliente cliente) {

		cliente = clienteRepository.save(cliente);

        return cliente;
	}

}
