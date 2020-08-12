package com.br.mastertech.cliente.service;


import com.br.mastertech.cliente.exception.UserNotFoundException;
import com.br.mastertech.cliente.models.Cliente;
import com.br.mastertech.cliente.repository.ClienteRepository;
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
			throw new UserNotFoundException("id - "+id);
		}
		return user.get();
	}

	public Cliente cadastrar(Cliente cliente) {

		cliente = clienteRepository.save(cliente);

        return cliente;
	}

}
