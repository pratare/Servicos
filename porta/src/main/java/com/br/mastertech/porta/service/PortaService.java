package com.br.mastertech.porta.service;

import com.br.mastertech.porta.exception.DoorNotFoundException;
import com.br.mastertech.porta.models.Porta;
import com.br.mastertech.porta.repository.PortaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PortaService {
	
	@Autowired
	PortaRepository portaRepository;

	public Porta buscarPorta(Integer id) {
		Optional<Porta> door = portaRepository.findById(id);
		if(!door.isPresent()) {
			throw new DoorNotFoundException();
		}
		return door.get();
	}

	public Porta cadastrar(Porta porta) {

		porta = portaRepository.save(porta);

        return porta;
	}

}
