package com.br.mastertech.contato.repository;

import com.br.mastertech.contato.models.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {

    Iterable<Contato> findAllByUsuarioId(Integer usuarioId);

}
